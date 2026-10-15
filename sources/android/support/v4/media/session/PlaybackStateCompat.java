package android.support.v4.media.session;

import J.i;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class PlaybackStateCompat implements Parcelable {
    public static final Parcelable.Creator<PlaybackStateCompat> CREATOR = new i(14);

    /* renamed from: o, reason: collision with root package name */
    public final int f2383o;

    /* renamed from: p, reason: collision with root package name */
    public final long f2384p;

    /* renamed from: q, reason: collision with root package name */
    public final long f2385q;

    /* renamed from: r, reason: collision with root package name */
    public final float f2386r;

    /* renamed from: s, reason: collision with root package name */
    public final long f2387s;

    /* renamed from: t, reason: collision with root package name */
    public final int f2388t;

    /* renamed from: u, reason: collision with root package name */
    public final CharSequence f2389u;

    /* renamed from: v, reason: collision with root package name */
    public final long f2390v;

    /* renamed from: w, reason: collision with root package name */
    public final ArrayList f2391w;

    /* renamed from: x, reason: collision with root package name */
    public final long f2392x;
    public final Bundle y;

    /* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
    /* loaded from: classes.dex */
    public static final class CustomAction implements Parcelable {
        public static final Parcelable.Creator<CustomAction> CREATOR = new Object();

        /* renamed from: o, reason: collision with root package name */
        public final String f2393o;

        /* renamed from: p, reason: collision with root package name */
        public final CharSequence f2394p;

        /* renamed from: q, reason: collision with root package name */
        public final int f2395q;

        /* renamed from: r, reason: collision with root package name */
        public final Bundle f2396r;

        public CustomAction(Parcel parcel) {
            this.f2393o = parcel.readString();
            this.f2394p = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f2395q = parcel.readInt();
            this.f2396r = parcel.readBundle(a.class.getClassLoader());
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final String toString() {
            return "Action:mName='" + ((Object) this.f2394p) + ", mIcon=" + this.f2395q + ", mExtras=" + this.f2396r;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i4) {
            parcel.writeString(this.f2393o);
            TextUtils.writeToParcel(this.f2394p, parcel, i4);
            parcel.writeInt(this.f2395q);
            parcel.writeBundle(this.f2396r);
        }
    }

    public PlaybackStateCompat(Parcel parcel) {
        this.f2383o = parcel.readInt();
        this.f2384p = parcel.readLong();
        this.f2386r = parcel.readFloat();
        this.f2390v = parcel.readLong();
        this.f2385q = parcel.readLong();
        this.f2387s = parcel.readLong();
        this.f2389u = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f2391w = parcel.createTypedArrayList(CustomAction.CREATOR);
        this.f2392x = parcel.readLong();
        this.y = parcel.readBundle(a.class.getClassLoader());
        this.f2388t = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "PlaybackState {state=" + this.f2383o + ", position=" + this.f2384p + ", buffered position=" + this.f2385q + ", speed=" + this.f2386r + ", updated=" + this.f2390v + ", actions=" + this.f2387s + ", error code=" + this.f2388t + ", error message=" + this.f2389u + ", custom actions=" + this.f2391w + ", active item id=" + this.f2392x + "}";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeInt(this.f2383o);
        parcel.writeLong(this.f2384p);
        parcel.writeFloat(this.f2386r);
        parcel.writeLong(this.f2390v);
        parcel.writeLong(this.f2385q);
        parcel.writeLong(this.f2387s);
        TextUtils.writeToParcel(this.f2389u, parcel, i4);
        parcel.writeTypedList(this.f2391w);
        parcel.writeLong(this.f2392x);
        parcel.writeBundle(this.y);
        parcel.writeInt(this.f2388t);
    }
}
