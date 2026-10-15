package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class RE {
    public static final RE d = new RE(new C0997oh[0]);

    /* renamed from: a, reason: collision with root package name */
    public final int f6797a;

    /* renamed from: b, reason: collision with root package name */
    public final Gt f6798b;
    public int c;

    static {
        Integer.toString(0, 36);
    }

    public RE(C0997oh... c0997ohArr) {
        this.f6798b = AbstractC1137rt.s(c0997ohArr);
        this.f6797a = c0997ohArr.length;
        int i4 = 0;
        while (i4 < this.f6798b.f5346r) {
            int i5 = i4 + 1;
            int i6 = i5;
            while (true) {
                Gt gt = this.f6798b;
                if (i6 < gt.f5346r) {
                    if (((C0997oh) gt.get(i4)).equals(this.f6798b.get(i6))) {
                        Wj.i("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                    }
                    i6++;
                }
            }
            i4 = i5;
        }
    }

    public final C0997oh a(int i4) {
        return (C0997oh) this.f6798b.get(i4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || RE.class != obj.getClass()) {
            return false;
        }
        RE re = (RE) obj;
        return this.f6797a == re.f6797a && this.f6798b.equals(re.f6798b);
    }

    public final int hashCode() {
        int i4 = this.c;
        if (i4 != 0) {
            return i4;
        }
        int hashCode = this.f6798b.hashCode();
        this.c = hashCode;
        return hashCode;
    }
}
