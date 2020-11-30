package org.m0skit0.android.mapswrapper.model

import android.content.Context

class MapStyleOptions {

    internal var google: com.google.android.gms.maps.model.MapStyleOptions? = null
    internal var huawei: com.huawei.hms.maps.model.MapStyleOptions? = null

    companion object {

        fun loadRawResourceStyle(context: Context, id: Int): MapStyleOptions {
            val googleMapStyleOptions = com.google.android.gms.maps.model.MapStyleOptions.loadRawResourceStyle(context, id)
            val huaweiMapStyleOptions = com.huawei.hms.maps.model.MapStyleOptions.loadRawResourceStyle(context, id)
            return MapStyleOptions().apply {
                google = googleMapStyleOptions
                huawei = huaweiMapStyleOptions
            }
        }
    }
}