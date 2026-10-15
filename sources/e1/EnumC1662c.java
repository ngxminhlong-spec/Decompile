package e1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: e1.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC1662c {

    /* renamed from: o, reason: collision with root package name */
    public static final EnumC1662c f12675o;

    /* renamed from: p, reason: collision with root package name */
    public static final EnumC1662c f12676p;

    /* renamed from: q, reason: collision with root package name */
    public static final EnumC1662c f12677q;

    /* renamed from: r, reason: collision with root package name */
    public static final EnumC1662c f12678r;

    /* renamed from: s, reason: collision with root package name */
    public static final EnumC1662c f12679s;

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ EnumC1662c[] f12680t;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, e1.c] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, e1.c] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, e1.c] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, e1.c] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, e1.c] */
    static {
        ?? r02 = new Enum("SELECT_ELEMENT", 0);
        f12675o = r02;
        ?? r1 = new Enum("SELECT_IO", 1);
        f12676p = r1;
        ?? r32 = new Enum("MULTIPLE_SELECT", 2);
        f12677q = r32;
        ?? r5 = new Enum("CREATE_PATH_LINK", 3);
        f12678r = r5;
        ?? r7 = new Enum("INTERACTION", 4);
        f12679s = r7;
        f12680t = new EnumC1662c[]{r02, r1, r32, r5, r7};
    }

    public static EnumC1662c valueOf(String str) {
        return (EnumC1662c) Enum.valueOf(EnumC1662c.class, str);
    }

    public static EnumC1662c[] values() {
        return (EnumC1662c[]) f12680t.clone();
    }
}
