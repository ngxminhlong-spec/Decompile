package t2;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: t2.n, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC2007n {

    /* renamed from: o, reason: collision with root package name */
    public static final EnumC2007n f14919o;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ EnumC2007n[] f14920p;

    /* JADX INFO: Fake field, exist only in values array */
    EnumC2007n EF0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, t2.n] */
    static {
        Enum r02 = new Enum("DEBUG_PARAM_UNKNOWN", 0);
        Enum r1 = new Enum("ALWAYS_SHOW", 1);
        Enum r32 = new Enum("GEO_OVERRIDE_EEA", 2);
        Enum r5 = new Enum("GEO_OVERRIDE_NON_EEA", 3);
        ?? r7 = new Enum("PREVIEWING_DEBUG_MESSAGES", 4);
        f14919o = r7;
        f14920p = new EnumC2007n[]{r02, r1, r32, r5, r7};
    }

    public static EnumC2007n[] values() {
        return (EnumC2007n[]) f14920p.clone();
    }
}
