
package com.gracenote.gnsdk;

public enum GnDspFeatureQuality {
  kDspFeatureQualityUnknown(0),
  kDspFeatureQualityStandard,
  kDspFeatureQualityShort,
  kDspFeatureQualitySilent;

  protected final int swigValue() {
    return swigValue;
  }

  protected static GnDspFeatureQuality swigToEnum(int swigValue) {
    GnDspFeatureQuality[] swigValues = GnDspFeatureQuality.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (GnDspFeatureQuality swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + GnDspFeatureQuality.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private GnDspFeatureQuality() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private GnDspFeatureQuality(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private GnDspFeatureQuality(GnDspFeatureQuality swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

