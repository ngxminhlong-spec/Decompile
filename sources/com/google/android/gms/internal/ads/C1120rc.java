package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.rc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1120rc implements Parcelable {
    public static final Parcelable.Creator<C1120rc> CREATOR = new C0295Ka(9);

    /* renamed from: o, reason: collision with root package name */
    public final InterfaceC0479cc[] f10477o;

    /* renamed from: p, reason: collision with root package name */
    public final long f10478p;

    public C1120rc(long j4, InterfaceC0479cc... interfaceC0479ccArr) {
        this.f10478p = j4;
        this.f10477o = interfaceC0479ccArr;
    }

    public C1120rc(Parcel parcel) {
        this.f10477o = new InterfaceC0479cc[parcel.readInt()];
        int i4 = 0;
        while (true) {
            InterfaceC0479cc[] interfaceC0479ccArr = this.f10477o;
            if (i4 >= interfaceC0479ccArr.length) {
                this.f10478p = parcel.readLong();
                return;
            } else {
                interfaceC0479ccArr[i4] = (InterfaceC0479cc) parcel.readParcelable(InterfaceC0479cc.class.getClassLoader());
                i4++;
            }
        }
    }

    public C1120rc(List list) {
        this(-9223372036854775807L, (InterfaceC0479cc[]) list.toArray(new InterfaceC0479cc[0]));
    }

    public final C1120rc a(InterfaceC0479cc... interfaceC0479ccArr) {
        int length = interfaceC0479ccArr.length;
        if (length == 0) {
            return this;
        }
        int i4 = AbstractC0751is.f9071a;
        InterfaceC0479cc[] interfaceC0479ccArr2 = this.f10477o;
        int length2 = interfaceC0479ccArr2.length;
        Object[] copyOf = Arrays.copyOf(interfaceC0479ccArr2, length2 + length);
        System.arraycopy(interfaceC0479ccArr, 0, copyOf, length2, length);
        return new C1120rc(this.f10478p, (InterfaceC0479cc[]) copyOf);
    }

    public final C1120rc b(C1120rc c1120rc) {
        return c1120rc == null ? this : a(c1120rc.f10477o);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C1120rc.class == obj.getClass()) {
            C1120rc c1120rc = (C1120rc) obj;
            if (Arrays.equals(this.f10477o, c1120rc.f10477o) && this.f10478p == c1120rc.f10478p) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = Arrays.hashCode(this.f10477o) * 31;
        long j4 = this.f10478p;
        return hashCode + ((int) (j4 ^ (j4 >>> 32)));
    }

    public final String toString() {
        String str;
        long j4 = this.f10478p;
        String arrays = Arrays.toString(this.f10477o);
        if (j4 == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + j4;
        }
        return U.a.k("entries=", arrays, str);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        InterfaceC0479cc[] interfaceC0479ccArr = this.f10477o;
        parcel.writeInt(interfaceC0479ccArr.length);
        for (InterfaceC0479cc interfaceC0479cc : interfaceC0479ccArr) {
            parcel.writeParcelable(interfaceC0479cc, 0);
        }
        parcel.writeLong(this.f10478p);
    }
}
