package com.example.android.quakereport;

public class Earthquake {

//    private String mMagnitude;

    private String mLocation;

    private String mDate;

    /** Time of the earthquake */
    private long mTimeInMilliseconds;

    /** Magnitude of the earthquake */
    private double mMagnitude;

    /** Website URL of the earthquake */
    private String mUrl;


//    public Earthquake(String magnitude, String location,String date) {
//        mMagnitude = magnitude;
//        mLocation = location;
//        mDate=date;
//    }

    /**
     * Constructs a new {@link Earthquake} object.
     *
     * @param magnitude is the magnitude (size) of the earthquake
     * @param location is the city location of the earthquake
     * @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the
     *  earthquake happened
     */
//    public Earthquake(Double magnitude, String location, long timeInMilliseconds) {
//        mMagnitude = magnitude;
//        mLocation = location;
//        mTimeInMilliseconds = timeInMilliseconds;
//    }
    /**
     * Constructs a new {@link Earthquake} object.
     *
     * @param magnitude is the magnitude (size) of the earthquake
     * @param location is the location where the earthquake happened
     * @param timeInMilliseconds is the time in milliseconds (from the Epoch) when the
     *                           earthquake happened
     * @param url is the website URL to find more details about the earthquake
     */
    public Earthquake(double magnitude, String location, long timeInMilliseconds, String url) {
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMilliseconds = timeInMilliseconds;
        mUrl = url;
    }

    /**
     * Get the default translation of the word.
     */
//    public String getMagnitude() {
//
//        return mMagnitude;
//    }

    /**
     * Get the Miwok translation of the word.
     */
    public String getLocation() {
        return mLocation;
    }

    /**
     * Return the image resource ID of the word.
     */
    public String getDate() {
        return mDate;
    }

    /**
     * Returns the time of the earthquake.
     */
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }

    /**
     * Returns the magnitude of the earthquake.
     */
    public double getMagnitude() {
        return mMagnitude;
    }

    public String getUrl() {
        return mUrl;
    }



}