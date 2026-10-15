package t3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: t3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2010c {

    /* renamed from: o, reason: collision with root package name */
    public static final EnumC2010c f14951o;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ EnumC2010c[] f14952p;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [t3.c, java.lang.Enum] */
    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f14951o = r02;
        f14952p = new EnumC2010c[]{r02, new Enum("SIGNED", 1), new Enum("FIXED", 2)};
    }

    public static EnumC2010c valueOf(String str) {
        return (EnumC2010c) Enum.valueOf(EnumC2010c.class, str);
    }

    public static EnumC2010c[] values() {
        return (EnumC2010c[]) f14952p.clone();
    }
}
