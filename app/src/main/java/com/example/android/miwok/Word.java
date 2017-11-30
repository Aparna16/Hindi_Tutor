package com.example.android.miwok;

/**
 * Created by Aparna R on 05-07-2017.
 */

public class Word {
private String defaultTranslation,hindiTranslation;
    private int imageSrc;
    Word(String eng,String hin)   {
        defaultTranslation=eng;
        hindiTranslation=hin;
        //imageSrc=img;
    }

public String getDefaultTranslation()
{
    return this.defaultTranslation;
}

public String getHindiTranslation()
{
    return this.hindiTranslation;
}

public int getImageSrc()
{
    return this.imageSrc;
}


}
