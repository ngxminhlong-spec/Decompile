package android.support.v4.media;

import J.i;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class MediaDescriptionCompat implements Parcelable {
    public static final Parcelable.Creator<MediaDescriptionCompat> CREATOR = new i(7);

    /* renamed from: o, reason: collision with root package name */
    public final String f2362o;

    /* renamed from: p, reason: collision with root package name */
    public final CharSequence f2363p;

    /* renamed from: q, reason: collision with root package name */
    public final CharSequence f2364q;

    /* renamed from: r, reason: collision with root package name */
    public final CharSequence f2365r;

    /* renamed from: s, reason: collision with root package name */
    public final Bitmap f2366s;

    /* renamed from: t, reason: collision with root package name */
    public final Uri f2367t;

    /* renamed from: u, reason: collision with root package name */
    public final Bundle f2368u;

    /* renamed from: v, reason: collision with root package name */
    public final Uri f2369v;

    /* renamed from: w, reason: collision with root package name */
    public Object f2370w;

    public MediaDescriptionCompat(String str, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, Bitmap bitmap, Uri uri, Bundle bundle, Uri uri2) {
        this.f2362o = str;
        this.f2363p = charSequence;
        this.f2364q = charSequence2;
        this.f2365r = charSequence3;
        this.f2366s = bitmap;
        this.f2367t = uri;
        this.f2368u = bundle;
        this.f2369v = uri2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return ((Object) this.f2363p) + ", " + ((Object) this.f2364q) + ", " + ((Object) this.f2365r);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        Object obj = this.f2370w;
        if (obj == null) {
            MediaDescription.Builder builder = new MediaDescription.Builder();
            builder.setMediaId(this.f2362o);
            builder.setTitle(this.f2363p);
            builder.setSubtitle(this.f2364q);
            builder.setDescription(this.f2365r);
            builder.setIconBitmap(this.f2366s);
            builder.setIconUri(this.f2367t);
            builder.setExtras(this.f2368u);
            builder.setMediaUri(this.f2369v);
            obj = builder.build();
            this.f2370w = obj;
        }
        ((MediaDescription) obj).writeToParcel(parcel, i4);
    }
}
