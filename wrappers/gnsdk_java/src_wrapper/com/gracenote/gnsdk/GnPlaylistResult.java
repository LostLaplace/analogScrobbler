/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 2.0.12
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.gracenote.gnsdk;

public class GnPlaylistResult extends GnObject {
  private long swigCPtr;

  protected GnPlaylistResult(long cPtr, boolean cMemoryOwn) {
    super(gnsdk_javaJNI.GnPlaylistResult_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GnPlaylistResult obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gnsdk_javaJNI.delete_GnPlaylistResult(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public GnPlaylistResultIdentIterable identifiers() {
    return new GnPlaylistResultIdentIterable(gnsdk_javaJNI.GnPlaylistResult_identifiers(swigCPtr, this), true);
  }

}
