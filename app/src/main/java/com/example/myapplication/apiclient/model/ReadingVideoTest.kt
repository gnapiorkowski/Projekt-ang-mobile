package com.example.myapplication.apiclient.model

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName

class ReadingVideoTest() : Parcelable {
    @SerializedName("text")
    var text: String? = null

    @SerializedName("questions")
    var questions: List<Question>? = null

    constructor(parcel: Parcel) : this() {
        text = parcel.readString()
        questions = parcel.createTypedArrayList(Question)
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(text)
        parcel.writeTypedList(questions)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<ReadingVideoTest> {
        override fun createFromParcel(parcel: Parcel): ReadingVideoTest {
            return ReadingVideoTest(parcel)
        }

        override fun newArray(size: Int): Array<ReadingVideoTest?> {
            return arrayOfNulls(size)
        }
    }
}
