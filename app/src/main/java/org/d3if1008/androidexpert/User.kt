package org.d3if1008.androidexpert

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
class User  (
    var username: String? = null,
    var name: String? = null,
    var location: String? = null,
    var company: String? = null,
    var repository: String? = null,
    var followers: String? = null,
    var following: String? = null,
    var avatar: Int = 0


): Parcelable
