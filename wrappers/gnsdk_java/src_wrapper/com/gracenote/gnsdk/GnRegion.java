/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.gracenote.gnsdk;

public enum GnRegion {
  kRegionDefault(0),
  kRegionGlobal,
  kRegionUS,
  kRegionJapan,
  kRegionChina,
  kRegionTaiwan,
  kRegionKorea,
  kRegionEurope,
  kRegionNorthAmerica,
  kRegionLatinAmerica,
  kRegionIndia;

  protected final int swigValue() {
    return swigValue;
  }

  protected static GnRegion swigToEnum(int swigValue) {
    GnRegion[] swigValues = GnRegion.class.getEnumConstants();
    if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
      return swigValues[swigValue];
    for (GnRegion swigEnum : swigValues)
      if (swigEnum.swigValue == swigValue)
        return swigEnum;
    throw new IllegalArgumentException("No enum " + GnRegion.class + " with value " + swigValue);
  }

  @SuppressWarnings("unused")
  private GnRegion() {
    this.swigValue = SwigNext.next++;
  }

  @SuppressWarnings("unused")
  private GnRegion(int swigValue) {
    this.swigValue = swigValue;
    SwigNext.next = swigValue+1;
  }

  @SuppressWarnings("unused")
  private GnRegion(GnRegion swigEnum) {
    this.swigValue = swigEnum.swigValue;
    SwigNext.next = this.swigValue+1;
  }

  private final int swigValue;

  private static class SwigNext {
    private static int next = 0;
  }
}

