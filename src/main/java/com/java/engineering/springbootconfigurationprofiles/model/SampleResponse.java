package com.java.engineering.springbootconfigurationprofiles.model;

import java.util.List;

public class SampleResponse {

    SamplePOJO[] samplePOJOS;

    public SamplePOJO[] getSamplePOJOS() {
        return samplePOJOS;
    }

    public void setSamplePOJOS(SamplePOJO[] samplePOJOS) {
        this.samplePOJOS = samplePOJOS;
    }
}
