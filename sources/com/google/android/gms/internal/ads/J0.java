package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class J0 extends F0 {
    public static final Parcelable.Creator<J0> CREATOR = new C0375a(15);

    /* renamed from: p, reason: collision with root package name */
    public final String f5775p;

    /* renamed from: q, reason: collision with root package name */
    public final AbstractC1137rt f5776q;

    public J0(String str, String str2, Gt gt) {
        super(str);
        Zf.O(!gt.isEmpty());
        this.f5775p = str2;
        AbstractC1137rt r4 = AbstractC1137rt.r(gt);
        this.f5776q = r4;
    }

    public static ArrayList a(String str) {
        ArrayList arrayList = new ArrayList();
        try {
            if (str.length() >= 10) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(8, 10))));
                return arrayList;
            }
            if (str.length() >= 7) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(5, 7))));
                return arrayList;
            }
            if (str.length() >= 4) {
                arrayList.add(Integer.valueOf(Integer.parseInt(str.substring(0, 4))));
            }
            return arrayList;
        } catch (NumberFormatException unused) {
            return new ArrayList();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && J0.class == obj.getClass()) {
            J0 j02 = (J0) obj;
            if (AbstractC0751is.c(this.f4965o, j02.f4965o) && AbstractC0751is.c(this.f5775p, j02.f5775p) && this.f5776q.equals(j02.f5776q)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:3:0x000c. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:15:0x013e A[Catch: NumberFormatException | StringIndexOutOfBoundsException -> 0x01d3, TryCatch #0 {NumberFormatException | StringIndexOutOfBoundsException -> 0x01d3, blocks: (B:6:0x00eb, B:13:0x0135, B:15:0x013e, B:16:0x014a, B:71:0x018e), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0149  */
    @Override // com.google.android.gms.internal.ads.F0, com.google.android.gms.internal.ads.InterfaceC0479cc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(com.google.android.gms.internal.ads.C0365Ya r8) {
        /*
            Method dump skipped, instructions count: 558
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.J0.g(com.google.android.gms.internal.ads.Ya):void");
    }

    public final int hashCode() {
        int hashCode = this.f4965o.hashCode() + 527;
        String str = this.f5775p;
        return this.f5776q.hashCode() + (((hashCode * 31) + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Override // com.google.android.gms.internal.ads.F0
    public final String toString() {
        return this.f4965o + ": description=" + this.f5775p + ": values=" + String.valueOf(this.f5776q);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f4965o);
        parcel.writeString(this.f5775p);
        parcel.writeStringArray((String[]) this.f5776q.toArray(new String[0]));
    }
}
