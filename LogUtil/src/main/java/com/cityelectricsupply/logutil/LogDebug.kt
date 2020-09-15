package com.cityelectricsupply.logutil

import android.util.Log


/**
 * Created by Jerome Raymond on 9/15/20 at 9:31 AM.
 * City Electric Supply
 * jerome.raymond@cityelectricsupply.com
 */
class LogDebug {

  companion object {
    val TAG = "SUPER_AWESOME_APP"
    fun d(message:String){
      Log.d(TAG,message)
    }
  }
}
