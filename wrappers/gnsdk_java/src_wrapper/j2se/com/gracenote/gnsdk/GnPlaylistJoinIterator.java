
package com.gracenote.gnsdk;

/** 
* <b>Experimental</b> 
*/ 
 
public class GnPlaylistJoinIterator {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected GnPlaylistJoinIterator(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(GnPlaylistJoinIterator obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        gnsdk_javaJNI.delete_GnPlaylistJoinIterator(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public GnPlaylistCollection __ref__() throws com.gracenote.gnsdk.GnException {
    return new GnPlaylistCollection(gnsdk_javaJNI.GnPlaylistJoinIterator___ref__(swigCPtr, this), false);
  }

  public GnPlaylistCollection next() throws com.gracenote.gnsdk.GnException {
    return new GnPlaylistCollection(gnsdk_javaJNI.GnPlaylistJoinIterator_next(swigCPtr, this), true);
  }

  public boolean hasNext() {
    return gnsdk_javaJNI.GnPlaylistJoinIterator_hasNext(swigCPtr, this);
  }

  public long distance(GnPlaylistJoinIterator itr) {
    return gnsdk_javaJNI.GnPlaylistJoinIterator_distance(swigCPtr, this, GnPlaylistJoinIterator.getCPtr(itr), itr);
  }

  public GnPlaylistJoinIterator(collection_join_provider provider, long pos) {
    this(gnsdk_javaJNI.new_GnPlaylistJoinIterator(collection_join_provider.getCPtr(provider), provider, pos), true);
  }

}
