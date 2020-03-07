package com.example.ocrv12;

import android.graphics.Bitmap;

import org.opencv.android.Utils;
import org.opencv.core.Mat;
import org.opencv.core.Point;
import org.opencv.core.Scalar;
import org.opencv.core.Size;
import org.opencv.imgproc.Imgproc;

public class PreProcessing {
//    public static void resize(Mat orgImage, int width, int height) {
//        Size size = orgImage.size();
//        double h = size.height;
//        double w = size.width;
//
//        Size dim = null;
//
//        if (width == 0 && height == 0) {
//            return;
//        }
//
//        if (width == 0) {
//            float r = height / (float) h;
//            dim = new Size((int) w * r, height);
//        } else {
//            float r = width / (float) w;
//            dim = new Size(width, (int) h * r);
//        }
//        Imgproc.resize(orgImage, orgImage, dim, Imgproc.INTER_AREA);
//    }
//Mat imageMat was the 2nd param
  //  public static Bitmap initial(Bitmap bitMapImage, double scale) {
       // Utils.bitmapToMat(bitMapImage, imageMat);
        //int minH = (int) (12.5 * imageMat.size().height) / 100;
       // Mat resizedMat = new Mat();
        //Imgproc.resize(imageMat, resizedMat, new Size(300,200), Imgproc.INTER_AREA);
        //Imgproc.cvtColor(resizedMat, resizedMat, Imgproc.COLOR_BGR2GRAY);
        //return resizedMat;



    //}
    public static Bitmap scaleImage(Bitmap bitmap, int width, int height)
    {
        Mat src = new Mat();
        Mat dst = new Mat();
        Utils.bitmapToMat(bitmap, src);
        //new Size(width, height)
        Imgproc.resize(src, dst, new Size(width,height),0,0,Imgproc.INTER_AREA);
        Bitmap bitmap1 = Bitmap.createBitmap(dst.cols(),dst.rows(),Bitmap.Config.RGB_565);
        Utils.matToBitmap(dst, bitmap1);
        return bitmap1;
    }


}
