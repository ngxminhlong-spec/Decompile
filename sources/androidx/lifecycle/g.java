package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class g {

    /* renamed from: o, reason: collision with root package name */
    public static final g f2968o;

    /* renamed from: p, reason: collision with root package name */
    public static final g f2969p;

    /* renamed from: q, reason: collision with root package name */
    public static final g f2970q;

    /* renamed from: r, reason: collision with root package name */
    public static final g f2971r;

    /* renamed from: s, reason: collision with root package name */
    public static final g f2972s;

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ g[] f2973t;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.lifecycle.g, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.lifecycle.g, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.lifecycle.g, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.lifecycle.g, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.lifecycle.g, java.lang.Enum] */
    static {
        ?? r02 = new Enum("DESTROYED", 0);
        f2968o = r02;
        ?? r1 = new Enum("INITIALIZED", 1);
        f2969p = r1;
        ?? r32 = new Enum("CREATED", 2);
        f2970q = r32;
        ?? r5 = new Enum("STARTED", 3);
        f2971r = r5;
        ?? r7 = new Enum("RESUMED", 4);
        f2972s = r7;
        f2973t = new g[]{r02, r1, r32, r5, r7};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) f2973t.clone();
    }

    public final boolean a() {
        return compareTo(f2971r) >= 0;
    }
}
