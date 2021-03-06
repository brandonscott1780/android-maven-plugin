package com.simpligility.maven.plugins.android.configuration;

import java.io.File;

/**
 * Configuration for the manifest update. This class is only the definition of the parameters that are shadowed in
 * {@link com.simpligility.maven.plugins.android.standalonemojos.ManifestMergerMojo} and used there.
 *
 * @author Benoit Billington
 */
public class ManifestMerger
{

    /**
     * Mirror of {@link com.simpligility.maven.plugins.android.standalonemojos.ManifestMergerMojo#manifestVersionName}.
     */
    protected String versionName;

    /**
     * Mirror of {@link com.simpligility.maven.plugins.android.standalonemojos.ManifestMergerMojo#manifestVersionCode}.
     */
    protected Integer versionCode;

    /**
     * Mirror of
     * {@link com.simpligility.maven.plugins.android.standalonemojos.ManifestMergerMojo#manifestUsesSdk}
     */
    protected UsesSdk usesSdk;

    /**
     * Mirror of {@link com.simpligility.maven.plugins.android.standalonemojos.ManifestMergerMojo
     * #manifestVersionCodeUpdateFromVersion}.
     */
    protected Boolean versionCodeUpdateFromVersion;

    /**
     * Mirror of {@link com.simpligility.maven.plugins.android.standalonemojos.ManifestMergerMojo
     * #manifestVersionNamingPattern}.
     */
    protected String versionNamingPattern;

    /**
     * Mirror of {@link com.simpligility.maven.plugins.android.standalonemojos.ManifestMergerMojo
     * #manifestVersionDigits}.
     */
    protected String versionDigits;

    /**
     * Mirror of {@link com.simpligility.maven.plugins.android.standalonemojos.ManifestMergerMojo
     * #manifestMergeLibraries}.
     */
    protected Boolean mergeLibraries;

    /**
     * Mirror of {@link com.simpligility.maven.plugins.android.standalonemojos.ManifestMergerMojo
     * #manifestMergeReportFile}.
     */
    protected File mergeReportFile;

    public String getVersionName()
    {
        return versionName;
    }

    public Integer getVersionCode()
    {
        return versionCode;
    }

    public UsesSdk getUsesSdk()
    {
        return usesSdk;
    }

    public Boolean getVersionCodeUpdateFromVersion()
    {
        return versionCodeUpdateFromVersion;
    }

    public String getVersionNamingPattern()
    {
        return versionNamingPattern;
    }

    public String getVersionDigits()
    {
        return versionDigits;
    }

    public Boolean getMergeLibraries()
    {
        return mergeLibraries;
    }

    public File getMergeReportFile()
    {
        return mergeReportFile;
    }
}
