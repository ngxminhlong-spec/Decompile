package M3;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: o, reason: collision with root package name */
    public static final a f1150o;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ a[] f1151p;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Enum, M3.a] */
    static {
        ?? r02 = new Enum("COROUTINE_SUSPENDED", 0);
        f1150o = r02;
        f1151p = new a[]{r02, new Enum("UNDECIDED", 1), new Enum("RESUMED", 2)};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) f1151p.clone();
    }
}
