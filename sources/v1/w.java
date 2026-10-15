package v1;

import android.util.SparseArray;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: o, reason: collision with root package name */
    public static final w f15086o;

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ w[] f15087p;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [v1.w, java.lang.Enum, java.lang.Object] */
    static {
        ?? r02 = new Enum("DEFAULT", 0);
        f15086o = r02;
        Enum r1 = new Enum("UNMETERED_ONLY", 1);
        Enum r32 = new Enum("UNMETERED_OR_DAILY", 2);
        Enum r5 = new Enum("FAST_IF_RADIO_AWAKE", 3);
        Enum r7 = new Enum("NEVER", 4);
        Enum r9 = new Enum("UNRECOGNIZED", 5);
        f15087p = new w[]{r02, r1, r32, r5, r7, r9};
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, r02);
        sparseArray.put(1, r1);
        sparseArray.put(2, r32);
        sparseArray.put(3, r5);
        sparseArray.put(4, r7);
        sparseArray.put(-1, r9);
    }

    public static w valueOf(String str) {
        return (w) Enum.valueOf(w.class, str);
    }

    public static w[] values() {
        return (w[]) f15087p.clone();
    }
}
