package t1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: t1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1992c {

    /* renamed from: o, reason: collision with root package name */
    public static final EnumC1992c f14844o;

    /* renamed from: p, reason: collision with root package name */
    public static final EnumC1992c f14845p;

    /* renamed from: q, reason: collision with root package name */
    public static final EnumC1992c f14846q;

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ EnumC1992c[] f14847r;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, t1.c] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, t1.c] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, t1.c] */
    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f14844o = r02;
        ?? r1 = new Enum("VERY_LOW", 1);
        f14845p = r1;
        ?? r32 = new Enum("HIGHEST", 2);
        f14846q = r32;
        f14847r = new EnumC1992c[]{r02, r1, r32};
    }

    public static EnumC1992c valueOf(String str) {
        return (EnumC1992c) Enum.valueOf(EnumC1992c.class, str);
    }

    public static EnumC1992c[] values() {
        return (EnumC1992c[]) f14847r.clone();
    }
}
