package C1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: o, reason: collision with root package name */
    public static final e f475o;

    /* renamed from: p, reason: collision with root package name */
    public static final e f476p;

    /* renamed from: q, reason: collision with root package name */
    public static final e f477q;

    /* renamed from: r, reason: collision with root package name */
    public static final /* synthetic */ e[] f478r;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, C1.e] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, C1.e] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, C1.e] */
    static {
        ?? r02 = new Enum("NETWORK_UNMETERED", 0);
        f475o = r02;
        ?? r1 = new Enum("DEVICE_IDLE", 1);
        f476p = r1;
        ?? r32 = new Enum("DEVICE_CHARGING", 2);
        f477q = r32;
        f478r = new e[]{r02, r1, r32};
    }

    public static e valueOf(String str) {
        return (e) Enum.valueOf(e.class, str);
    }

    public static e[] values() {
        return (e[]) f478r.clone();
    }
}
