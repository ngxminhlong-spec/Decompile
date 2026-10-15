package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: androidx.fragment.app.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0153b implements Parcelable {
    public static final Parcelable.Creator<C0153b> CREATOR = new J.i(17);

    /* renamed from: A, reason: collision with root package name */
    public final ArrayList f2786A;

    /* renamed from: B, reason: collision with root package name */
    public final ArrayList f2787B;

    /* renamed from: C, reason: collision with root package name */
    public final boolean f2788C;

    /* renamed from: o, reason: collision with root package name */
    public final int[] f2789o;

    /* renamed from: p, reason: collision with root package name */
    public final ArrayList f2790p;

    /* renamed from: q, reason: collision with root package name */
    public final int[] f2791q;

    /* renamed from: r, reason: collision with root package name */
    public final int[] f2792r;

    /* renamed from: s, reason: collision with root package name */
    public final int f2793s;

    /* renamed from: t, reason: collision with root package name */
    public final int f2794t;

    /* renamed from: u, reason: collision with root package name */
    public final String f2795u;

    /* renamed from: v, reason: collision with root package name */
    public final int f2796v;

    /* renamed from: w, reason: collision with root package name */
    public final int f2797w;

    /* renamed from: x, reason: collision with root package name */
    public final CharSequence f2798x;
    public final int y;

    /* renamed from: z, reason: collision with root package name */
    public final CharSequence f2799z;

    public C0153b(Parcel parcel) {
        this.f2789o = parcel.createIntArray();
        this.f2790p = parcel.createStringArrayList();
        this.f2791q = parcel.createIntArray();
        this.f2792r = parcel.createIntArray();
        this.f2793s = parcel.readInt();
        this.f2794t = parcel.readInt();
        this.f2795u = parcel.readString();
        this.f2796v = parcel.readInt();
        this.f2797w = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f2798x = (CharSequence) creator.createFromParcel(parcel);
        this.y = parcel.readInt();
        this.f2799z = (CharSequence) creator.createFromParcel(parcel);
        this.f2786A = parcel.createStringArrayList();
        this.f2787B = parcel.createStringArrayList();
        this.f2788C = parcel.readInt() != 0;
    }

    public C0153b(C0152a c0152a) {
        int size = c0152a.f2768a.size();
        this.f2789o = new int[size * 5];
        if (!c0152a.f2773h) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f2790p = new ArrayList(size);
        this.f2791q = new int[size];
        this.f2792r = new int[size];
        int i4 = 0;
        for (int i5 = 0; i5 < size; i5++) {
            w wVar = (w) c0152a.f2768a.get(i5);
            int i6 = i4 + 1;
            this.f2789o[i4] = wVar.f2934a;
            ArrayList arrayList = this.f2790p;
            AbstractComponentCallbacksC0157f abstractComponentCallbacksC0157f = wVar.f2935b;
            arrayList.add(abstractComponentCallbacksC0157f != null ? abstractComponentCallbacksC0157f.f2852r : null);
            int[] iArr = this.f2789o;
            iArr[i6] = wVar.c;
            iArr[i4 + 2] = wVar.d;
            int i7 = i4 + 4;
            iArr[i4 + 3] = wVar.f2936e;
            i4 += 5;
            iArr[i7] = wVar.f2937f;
            this.f2791q[i5] = wVar.f2938g.ordinal();
            this.f2792r[i5] = wVar.f2939h.ordinal();
        }
        this.f2793s = c0152a.f2771f;
        this.f2794t = c0152a.f2772g;
        this.f2795u = c0152a.f2775j;
        this.f2796v = c0152a.f2785t;
        this.f2797w = c0152a.f2776k;
        this.f2798x = c0152a.f2777l;
        this.y = c0152a.f2778m;
        this.f2799z = c0152a.f2779n;
        this.f2786A = c0152a.f2780o;
        this.f2787B = c0152a.f2781p;
        this.f2788C = c0152a.f2782q;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i4) {
        parcel.writeIntArray(this.f2789o);
        parcel.writeStringList(this.f2790p);
        parcel.writeIntArray(this.f2791q);
        parcel.writeIntArray(this.f2792r);
        parcel.writeInt(this.f2793s);
        parcel.writeInt(this.f2794t);
        parcel.writeString(this.f2795u);
        parcel.writeInt(this.f2796v);
        parcel.writeInt(this.f2797w);
        TextUtils.writeToParcel(this.f2798x, parcel, 0);
        parcel.writeInt(this.y);
        TextUtils.writeToParcel(this.f2799z, parcel, 0);
        parcel.writeStringList(this.f2786A);
        parcel.writeStringList(this.f2787B);
        parcel.writeInt(this.f2788C ? 1 : 0);
    }
}
