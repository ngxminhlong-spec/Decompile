package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1317w0 implements InterfaceC0479cc {
    public static final Parcelable.Creator<C1317w0> CREATOR = new C0375a(4);

    /* renamed from: o, reason: collision with root package name */
    public final String f11104o;

    /* renamed from: p, reason: collision with root package name */
    public final String f11105p;

    public C1317w0(Parcel parcel) {
        String readString = parcel.readString();
        int i4 = AbstractC0751is.f9071a;
        this.f11104o = readString;
        this.f11105p = parcel.readString();
    }

    public C1317w0(String str, String str2) {
        this.f11104o = str;
        this.f11105p = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            C1317w0 c1317w0 = (C1317w0) obj;
            if (this.f11104o.equals(c1317w0.f11104o) && this.f11105p.equals(c1317w0.f11105p)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0479cc
    public final void g(C0365Ya c0365Ya) {
        String str = this.f11104o;
        int hashCode = str.hashCode();
        String str2 = this.f11105p;
        switch (hashCode) {
            case 62359119:
                if (str.equals("ALBUM")) {
                    c0365Ya.c = str2;
                    return;
                }
                return;
            case 79833656:
                if (str.equals("TITLE")) {
                    c0365Ya.f7808a = str2;
                    return;
                }
                return;
            case 428414940:
                if (str.equals("DESCRIPTION")) {
                    c0365Ya.f7810e = str2;
                    return;
                }
                return;
            case 1746739798:
                if (str.equals("ALBUMARTIST")) {
                    c0365Ya.d = str2;
                    return;
                }
                return;
            case 1939198791:
                if (str.equals("ARTIST")) {
                    c0365Ya.f7809b = str2;
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final int hashCode() {
        return this.f11105p.hashCode() + ((this.f11104o.hashCode() + 527) * 31);
    }

    public final String toString() {
        return "VC: " + this.f11104o + "=" + this.f11105p;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f11104o);
        parcel.writeString(this.f11105p);
    }
}
