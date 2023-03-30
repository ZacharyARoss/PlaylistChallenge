package io.zipcoder;

import java.util.Objects;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {
        int buttonPressesUp = 0;
        int buttonPressesDown = 0;
        int k = startIndex;


        for (int i = k; i < playList.length; i += 0) {
            if (playList[i] != selection) {
                i++;
                buttonPressesDown += 1;
            }else if (Objects.equals(playList[i], selection)) {
                break;
            }else if (i == playList.length - 1) {
                i = 0;

            }
        }
        for (int j = k; j < playList.length; j+=0){
            if (j == 0) {
                j = playList.length - 1;
                buttonPressesUp += 1;
                    if(playList[j] == selection){
                        break;
                    }
            }
            else if (playList[j] == selection) {
                break;
            } else if (playList[j] != selection ) {
                    j--;
                    buttonPressesUp += 1;
            }
        }

        if (buttonPressesUp < buttonPressesDown){
            return  buttonPressesUp;
        } else if (buttonPressesDown <= buttonPressesUp) {
            return buttonPressesDown;
        }
        return null;
        }


    }

