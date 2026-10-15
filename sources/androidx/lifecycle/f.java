package androidx.lifecycle;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class f {
    private static final /* synthetic */ f[] $VALUES;
    public static final d Companion;
    public static final f ON_ANY;
    public static final f ON_CREATE;
    public static final f ON_DESTROY;
    public static final f ON_PAUSE;
    public static final f ON_RESUME;
    public static final f ON_START;
    public static final f ON_STOP;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.lifecycle.f, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.lifecycle.d, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v1, types: [androidx.lifecycle.f, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.lifecycle.f, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v1, types: [androidx.lifecycle.f, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [androidx.lifecycle.f, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v1, types: [androidx.lifecycle.f, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r9v1, types: [androidx.lifecycle.f, java.lang.Enum] */
    static {
        ?? r02 = new Enum("ON_CREATE", 0);
        ON_CREATE = r02;
        ?? r1 = new Enum("ON_START", 1);
        ON_START = r1;
        ?? r32 = new Enum("ON_RESUME", 2);
        ON_RESUME = r32;
        ?? r5 = new Enum("ON_PAUSE", 3);
        ON_PAUSE = r5;
        ?? r7 = new Enum("ON_STOP", 4);
        ON_STOP = r7;
        ?? r9 = new Enum("ON_DESTROY", 5);
        ON_DESTROY = r9;
        ?? r11 = new Enum("ON_ANY", 6);
        ON_ANY = r11;
        $VALUES = new f[]{r02, r1, r32, r5, r7, r9, r11};
        Companion = new Object();
    }

    public static f valueOf(String str) {
        return (f) Enum.valueOf(f.class, str);
    }

    public static f[] values() {
        return (f[]) $VALUES.clone();
    }

    public final g a() {
        switch (e.f2967a[ordinal()]) {
            case 1:
            case 2:
                return g.f2970q;
            case 3:
            case 4:
                return g.f2971r;
            case 5:
                return g.f2972s;
            case 6:
                return g.f2968o;
            default:
                throw new IllegalArgumentException(this + " has no target state");
        }
    }
}
