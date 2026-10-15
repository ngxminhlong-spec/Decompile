package com.google.android.gms.internal.measurement;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.measurement.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1547m0 implements K1 {

    /* renamed from: b, reason: collision with root package name */
    public static final C1547m0 f11970b = new C1547m0(0);
    public static final C1547m0 c = new C1547m0(1);
    public static final C1547m0 d = new C1547m0(2);

    /* renamed from: e, reason: collision with root package name */
    public static final C1547m0 f11971e = new C1547m0(3);

    /* renamed from: f, reason: collision with root package name */
    public static final C1547m0 f11972f = new C1547m0(4);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f11973a;

    public /* synthetic */ C1547m0(int i4) {
        this.f11973a = i4;
    }

    @Override // com.google.android.gms.internal.measurement.K1
    public final boolean a(int i4) {
        switch (this.f11973a) {
            case 0:
                return i4 == 0 || i4 == 1 || i4 == 2 || i4 == 3 || i4 == 4;
            case 1:
                switch (i4) {
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        return true;
                    default:
                        return false;
                }
            case 2:
                return i4 == 0 || i4 == 1 || i4 == 2 || i4 == 3 || i4 == 4 || i4 == 5;
            case 3:
                return i4 == 1 || i4 == 2;
            default:
                return i4 == 0 || i4 == 1 || i4 == 2 || i4 == 3 || i4 == 4;
        }
    }
}
