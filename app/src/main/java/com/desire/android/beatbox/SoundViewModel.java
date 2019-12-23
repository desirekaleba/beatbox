package com.desire.android.beatbox;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

/**
 * Created by desire on 12/8/2018.
 */

public class SoundViewModel extends BaseObservable {
    private Sound mSound;
    private BeatBox mBeatBox;

    public SoundViewModel(BeatBox beatBox){
        mBeatBox = beatBox;
    }
    public Sound getSound(){
        return mSound;
    }
    public void setSound(Sound sound){
        mSound = sound;
        notifyChange();
    }
    public void onButtonClicked(){
        mBeatBox.play(mSound);
    }
    @Bindable
    public String getTitle(){
        return mSound.getName();
    }
}
