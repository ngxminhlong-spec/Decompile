package Z3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: o, reason: collision with root package name */
    public static final b f2312o;

    /* renamed from: p, reason: collision with root package name */
    public static final b f2313p;

    /* renamed from: q, reason: collision with root package name */
    public static final b f2314q;

    /* renamed from: r, reason: collision with root package name */
    public static final b f2315r;

    /* renamed from: s, reason: collision with root package name */
    public static final b f2316s;

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ b[] f2317t;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, Z3.b] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, Z3.b] */
    /* JADX WARN: Type inference failed for: r3v1, types: [java.lang.Enum, Z3.b] */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.Enum, Z3.b] */
    /* JADX WARN: Type inference failed for: r7v1, types: [java.lang.Enum, Z3.b] */
    static {
        ?? r02 = new Enum("CPU_ACQUIRED", 0);
        f2312o = r02;
        ?? r1 = new Enum("BLOCKING", 1);
        f2313p = r1;
        ?? r32 = new Enum("PARKING", 2);
        f2314q = r32;
        ?? r5 = new Enum("DORMANT", 3);
        f2315r = r5;
        ?? r7 = new Enum("TERMINATED", 4);
        f2316s = r7;
        f2317t = new b[]{r02, r1, r32, r5, r7};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f2317t.clone();
    }
}
