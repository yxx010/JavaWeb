package upload;

import java.util.UUID;

public class UploadUtils {
    public static String getUuidFileName(String fileName){
        //查看.所在的位置，会返回来一个位置。
        int idx=fileName.lastIndexOf(".");
        //获取扩展名，从.的位置往后截，获取.jpg之类的扩展名
        String exName=fileName.substring(idx); //.jpg
        //生成随机串，带一堆-，不想要可以替换掉
        String uuidFileName= UUID.randomUUID().toString().replace("-","")+exName;
        return uuidFileName;
    }

   /* public static void main(String[] args) {
        System.out.println(UploadUtils.getUuidFileName("a1.jpg"));
    }*/
}
