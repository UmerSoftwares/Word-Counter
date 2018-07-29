package UmerSoftwares;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Hafiz Muhammad Umer
 */

public class data {
    public String path="C:\\Umer Softwares\\Word Counter";
    public int maxRecPerFile=100;
    private int noOfFiles=0;
    Map <Integer,Integer> fileInfo = new HashMap <Integer,Integer> ();
    data() throws Exception    
    {
        //Initialize
        File f=new File (path+"\\record.txt");
        if (!f.exists())
        {
            if (!create())
                throw new Exception("Failed in create method");
        }
        //create a scanner for reading files
        Scanner sc;
        try
        {
            sc = new Scanner(f);
        }
        catch (FileNotFoundException e)
        {
            throw new Exception("Failed reading file");
        }
        
        if (!sc.hasNext() ||sc.next().charAt(0)!='t'){
            throw new Exception("Data Corrupt");
        }
        noOfFiles=sc.nextInt();
        try{
        for (int i=0;i<noOfFiles;i++)
        {
            fileInfo.put(sc.nextInt(), sc.nextInt());
        }
        }
        catch (Exception e)
        {
            throw new Exception("Data Corrupt");
        }
    }
    
    private boolean create()
    {
        
        File folder=new File(path);
        if (!folder.exists())
        {
            if (!folder.mkdirs())
                return false;
        }
        try
        {
            Formatter f =  new Formatter(path+"\\record.txt");
            f.format("%s","t 1 1 0 ");
            f.close();
            Formatter f1 =  new Formatter(path+"\\data1.txt");
            f1.close();
        } 
        catch (FileNotFoundException ex) {
            return false;
        }
        return true;
    }
    
    public int size()
    {
        int count=0;
        for (int i=0;i<noOfFiles;i++)
        {
            count+=fileInfo.get((i+1));
        }
        return count;
    }
    public int getRecordNo(int i)
    {
        int count=1;
        for (int j=0;j<noOfFiles;j++)
        {
            if (fileInfo.get(j+1)<i)
                i-=fileInfo.get(j+1);
            else
                break;
            count++;
        }
        if (count>noOfFiles)
            return 0;
        return i;
    }
    public int getFileNo(int i)
    {
        int count=1;
        for (int j=0;j<noOfFiles;j++)
        {
            if (fileInfo.get(j+1)<i)
                i-=fileInfo.get(j+1);
            else
                break;
            count++;
        }
        if (count>noOfFiles)
            return 0;
        return count;
    }
    public void add(String s) throws Exception
    {
        if (s==null || "".equals(s))
            throw new Exception("Empty Record");
        s=encode(s);
        boolean newFile=(fileInfo.get(noOfFiles)>this.maxRecPerFile-1)? true :false;
        if (newFile)
            addNewFile();
        String[] ar=new String[fileInfo.get(noOfFiles)+1];
        String filepath=path+"\\data"+noOfFiles+".txt";
        File f=new File(filepath);
        try
        {
            Scanner sc=new Scanner(f);
            for (int i=0;i<ar.length-1;i++)
            {
                ar[i]=sc.next();
            }
            ar[ar.length-1]=s;
        }
        catch (FileNotFoundException e)
        {
            throw new Exception("Error reading file");
        }
        try
        {
            Formatter fr=new Formatter(filepath);
            for (int i=0;i<ar.length;i++)
            {
                fr.format("%s ", ar[i]);
            }
            fr.close();
        }
        catch (FileNotFoundException e)
        {
            throw new Exception("Error writing file");
        }
        fileInfo.put(noOfFiles, fileInfo.get(noOfFiles)+1);
        saveRecord();
    }
    private void addNewFile() throws Exception
    {
        noOfFiles++;
        fileInfo.put(noOfFiles, 0);
        saveRecord();
        String fileName="data"+noOfFiles+".txt";
        try
        {
            Formatter f=new Formatter (path+"\\"+fileName);
            f.close();
        }
        catch (Exception e)
        {
            throw new Exception("Error creating file");
        }
    }
    
    private void saveRecord() throws Exception
    {
        try{
            Formatter f =  new Formatter(path+"\\record.txt");
            f.format("t %s ", noOfFiles+"");
            for (int i=0;i<noOfFiles;i++)
            {
                f.format("%s %s ",i+1+"", fileInfo.get(i+1)+"");
            }
            f.close();
        }
        catch (Exception e)
        {
            throw new Exception("Error saving record");
        }
    }
    private String decode(String s)
    {
        char[] c=s.toCharArray();
        String out="";
        for (int i=0;i<c.length;i++)
        {
            int num=26*(c[i++]-97);
            num+=c[i]-97;
            out+=(char)num;
        }
        return out;
    }
    private String encode(String s)
    {
        char[] c =s.toCharArray();
        String out="";
        for (int i=0;i<c.length;i++)
        {
            if ((int)c[i]>26*26-1)
            {
                c[i]=42;
            }
            int r=c[i]%26;
            int f=(c[i]-r)/26;
            r+=97;
            f+=97;
            out+=(char)f;
            out+=(char)r;
        }
        return out;
    }
    
    public void delete (int i) throws Exception
    {
        int recordNo;
        int fileNo;
        fileNo=this.getFileNo(i);
        recordNo=getRecordNo(i);
        if (fileNo==0 || recordNo==0)
            throw new Exception("Record not found");
        Scanner sc=null;
        File f=new File(path+"\\data"+fileNo+".txt");
        try{
            sc=new Scanner(f);
        }
        catch (FileNotFoundException e)
        {
            throw new Exception("Error deleting record");
        }
        String[] s=new String[fileInfo.get(fileNo)];
        for (int j=0;j<s.length;j++)
        {
            s[j]=sc.next();
        }
        Formatter fr=null;
        try
        {
            fr=new Formatter(path+"\\data"+fileNo+".txt");
            for (int j=0;j<this.fileInfo.get(fileNo);j++)
            {
                if (j==recordNo-1)
                    continue;
                fr.format("%s ", s[j]);
            }
            fr.close();
        }
        catch (FileNotFoundException e)
        {
            throw new Exception("Error deleting record");
        }
        this.fileInfo.put(fileNo, fileInfo.get(fileNo)-1);
        this.saveRecord();
    }
    public String get(int i) throws Exception
    {
        int recordNo;
        int fileNo;
        fileNo=this.getFileNo(i);
        recordNo=getRecordNo(i);
        if (fileNo==0 || recordNo==0)
            throw new Exception("Record not found");
        Scanner sc=null;
        File f=new File(path+"\\data"+fileNo+".txt");
        try{
            sc=new Scanner(f);
        }
        catch (FileNotFoundException e)
        {
            throw new Exception("Error retrieving record");
        }
        String[] s=new String[fileInfo.get(fileNo)];
        try{
        for (int j=0;j<s.length;j++)
        {
            s[j]=sc.next();
        }}
        catch (Exception e)
        {
            throw new Exception ("Files were altered");
        }
        return decode(s[recordNo-1]);
    }
}
