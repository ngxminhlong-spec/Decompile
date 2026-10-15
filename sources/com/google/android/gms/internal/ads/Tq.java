package com.google.android.gms.internal.ads;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Tq {

    /* renamed from: o, reason: collision with root package name */
    public static final Tq f7090o;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ Tq[] f7091p;

    /* JADX INFO: Fake field, exist only in values array */
    Tq EF0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, com.google.android.gms.internal.ads.Tq] */
    static {
        Enum r02 = new Enum("VIDEO_CONTROLS", 0);
        Enum r1 = new Enum("CLOSE_AD", 1);
        ?? r32 = new Enum("NOT_VISIBLE", 2);
        f7090o = r32;
        f7091p = new Tq[]{r02, r1, r32, new Enum("OTHER", 3)};
    }

    public static Tq[] values() {
        return (Tq[]) f7091p.clone();
    }
}
