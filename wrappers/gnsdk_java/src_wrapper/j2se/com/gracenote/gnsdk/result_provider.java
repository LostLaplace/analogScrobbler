
package com.gracenote.gnsdk;

public class result_provider {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected result_provider(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(result_provider obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gnsdk_javaJNI.delete_result_provider(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public result_provider() {
    this(gnsdk_javaJNI.new_result_provider(), true);
  }

  public GnPlaylistIdentifier getData(long pos) {
    return new GnPlaylistIdentifier(gnsdk_javaJNI.result_provider_getData(swigCPtr, this, pos), true);
  }

  public long count() {
    return gnsdk_javaJNI.result_provider_count(swigCPtr, this);
  }

}
