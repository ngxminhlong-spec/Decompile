package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class v implements Parcelable {
    public static final Parcelable.Creator<v> CREATOR = new J.i(19);

    /* renamed from: A, reason: collision with root package name */
    public Bundle f2921A;

    /* renamed from: B, reason: collision with root package name */
    public AbstractComponentCallbacksC0157f f2922B;

    /* renamed from: o, reason: collision with root package name */
    public final String f2923o;

    /* renamed from: p, reason: collision with root package name */
    public final String f2924p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f2925q;

    /* renamed from: r, reason: collision with root package name */
    public final int f2926r;

    /* renamed from: s, reason: collision with root package name */
    public final int f2927s;

    /* renamed from: t, reason: collision with root package name */
    public final String f2928t;

    /* renamed from: u, reason: collision with root package name */
    public final boolean f2929u;

    /* renamed from: v, reason: collision with root package name */
    public final boolean f2930v;

    /* renamed from: w, reason: collision with root package name */
    public final boolean f2931w;

    /* renamed from: x, reason: collision with root package name */
    public final Bundle f2932x;
    public final boolean y;

    /* renamed from: z, reason: collision with root package name */
    public final int f2933z;

    public v(Parcel parcel) {
        this.f2923o = parcel.readString();
        this.f2924p = parcel.readString();
        this.f2925q = parcel.readInt() != 0;
        this.f2926r = parcel.readInt();
        this.f2927s = parcel.readInt();
        this.f2928t = parcel.readString();
        this.f2929u = parcel.readInt() != 0;
        this.f2930v = parcel.readInt() != 0;
        this.f2931w = parcel.readInt() != 0;
        this.f2932x = parcel.readBundle();
        this.y = parcel.readInt() != 0;
        this.f2921A = parcel.readBundle();
        this.f2933z = parcel.readInt();
    }

    public v(AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f) {
        this.f2923o = abstractComponentCallbacksC0157f.getClass().getName();
        this.f2924p = abstractComponentCallbacksC0157f.f2852r;
        this.f2925q = abstractComponentCallbacksC0157f.f2859z;
        this.f2926r = abstractComponentCallbacksC0157f.f2827I;
        this.f2927s = abstractComponentCallbacksC0157f.f2828J;
        this.f2928t = abstractComponentCallbacksC0157f.f2829K;
        this.f2929u = abstractComponentCallbacksC0157f.N;
        this.f2930v = abstractComponentCallbacksC0157f.y;
        this.f2931w = abstractComponentCallbacksC0157f.f2831M;
        this.f2932x = abstractComponentCallbacksC0157f.f2853s;
        this.y = abstractComponentCallbacksC0157f.f2830L;
        this.f2933z = abstractComponentCallbacksC0157f.f2844a0.ordinal();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentState{");
        sb.append(this.f2923o);
        sb.append(" (");
        sb.append(this.f2924p);
        sb.append(")}:");
        if (this.f2925q) {
            sb.append(" fromLayout");
        }
        int i4 = this.f2927s;
        if (i4 != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(i4));
        }
        String str = this.f2928t;
        if (str != null && !str.isEmpty()) {
            sb.append(" tag=");
            sb.append(str);
        }
        if (this.f2929u) {
            sb.append(" retainInstance");
        }
        if (this.f2930v) {
            sb.append(" removing");
        }
        if (this.f2931w) {
            sb.append(" detached");
        }
        if (this.y) {
            sb.append(" hidden");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeString(this.f2923o);
        parcel.writeString(this.f2924p);
        parcel.writeInt(this.f2925q ? 1 : 0);
        parcel.writeInt(this.f2926r);
        parcel.writeInt(this.f2927s);
        parcel.writeString(this.f2928t);
        parcel.writeInt(this.f2929u ? 1 : 0);
        parcel.writeInt(this.f2930v ? 1 : 0);
        parcel.writeInt(this.f2931w ? 1 : 0);
        parcel.writeBundle(this.f2932x);
        parcel.writeInt(this.y ? 1 : 0);
        parcel.writeBundle(this.f2921A);
        parcel.writeInt(this.f2933z);
    }
}
