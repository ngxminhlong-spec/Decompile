package W3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: W3.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC0137p {

    /* renamed from: o, reason: collision with root package name */
    public static final EnumC0137p f2111o;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ EnumC0137p[] f2112p;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, W3.p] */
    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f2111o = r02;
        f2112p = new EnumC0137p[]{r02, new Enum("LAZY", 1), new Enum("ATOMIC", 2), new Enum("UNDISPATCHED", 3)};
    }

    public static EnumC0137p valueOf(String str) {
        return (EnumC0137p) Enum.valueOf(EnumC0137p.class, str);
    }

    public static EnumC0137p[] values() {
        return (EnumC0137p[]) f2112p.clone();
    }
}
