package v1;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class p {

    /* renamed from: o, reason: collision with root package name */
    public static final p f15080o;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ p[] f15081p;

    /* JADX INFO: Fake field, exist only in values array */
    p EF0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Enum, v1.p] */
    static {
        Enum r02 = new Enum("UNKNOWN", 0);
        ?? r1 = new Enum("ANDROID_FIREBASE", 1);
        f15080o = r1;
        f15081p = new p[]{r02, r1};
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) f15081p.clone();
    }
}
