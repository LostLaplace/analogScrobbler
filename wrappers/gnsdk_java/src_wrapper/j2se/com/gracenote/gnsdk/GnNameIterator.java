
package com.gracenote.gnsdk;

/** 
* Iterate through a collection of {@link GnName} objects 
*/ 
 
public class GnNameIterator {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected GnNameIterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GnNameIterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gnsdk_javaJNI.delete_GnNameIterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public GnName __ref__() throws com.gracenote.gnsdk.GnException {
    return new GnName(gnsdk_javaJNI.GnNameIterator___ref__(swigCPtr, this), false);
  }

  public GnName next() throws com.gracenote.gnsdk.GnException {
    return new GnName(gnsdk_javaJNI.GnNameIterator_next(swigCPtr, this), true);
  }

  public boolean hasNext() {
    return gnsdk_javaJNI.GnNameIterator_hasNext(swigCPtr, this);
  }

  public long distance(GnNameIterator itr) {
    return gnsdk_javaJNI.GnNameIterator_distance(swigCPtr, this, GnNameIterator.getCPtr(itr), itr);
  }

  public GnNameIterator(GnNameProvider provider, long pos) {
    this(gnsdk_javaJNI.new_GnNameIterator(GnNameProvider.getCPtr(provider), provider, pos), true);
  }

}
