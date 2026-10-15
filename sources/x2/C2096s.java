package x2;

import android.os.Parcel;
import android.os.Parcelable;
import i2.AbstractC1717a;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: x2.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2096s extends AbstractC1717a {
    public static final Parcelable.Creator<C2096s> CREATOR = new C2067d(2);

    /* renamed from: o, reason: collision with root package name */
    public final String f15781o;

    /* renamed from: p, reason: collision with root package name */
    public final r f15782p;

    /* renamed from: q, reason: collision with root package name */
    public final String f15783q;

    /* renamed from: r, reason: collision with root package name */
    public final long f15784r;

    public C2096s(String str, r rVar, String str2, long j4) {
        this.f15781o = str;
        this.f15782p = rVar;
        this.f15783q = str2;
        this.f15784r = j4;
    }

    public C2096s(C2096s c2096s, long j4) {
        h2.y.i(c2096s);
        this.f15781o = c2096s.f15781o;
        this.f15782p = c2096s.f15782p;
        this.f15783q = c2096s.f15783q;
        this.f15784r = j4;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f15782p);
        StringBuilder n4 = U.a.n("origin=", this.f15783q, ",name=", this.f15781o, ",params=");
        n4.append(valueOf);
        return n4.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        C2067d.a(this, parcel, i4);
    }
}
