package com.rick.pattern_11_proxy.d05_protect_proxy;

/**
 * @Author: Rick
 * @Date: 2022/9/24 08:23
 */
public interface Person {
    String getName();

    String getGender();

    String getInterests();

    int getGeekRating();

    void setName(String name);

    void setGender(String gender);

    void setInterests(String interests);

    void setGeekRating(int rating);
}
