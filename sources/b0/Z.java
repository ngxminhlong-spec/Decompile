package b0;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class Z {

    /* renamed from: a, reason: collision with root package name */
    public int f3216a;

    /* renamed from: b, reason: collision with root package name */
    public int f3217b;
    public int c;
    public int d;

    /* renamed from: e, reason: collision with root package name */
    public int f3218e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f3219f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f3220g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f3221h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f3222i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f3223j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f3224k;

    /* renamed from: l, reason: collision with root package name */
    public int f3225l;

    /* renamed from: m, reason: collision with root package name */
    public long f3226m;

    /* renamed from: n, reason: collision with root package name */
    public int f3227n;

    public final void a(int i4) {
        if ((this.d & i4) != 0) {
            return;
        }
        throw new IllegalStateException("Layout state should be one of " + Integer.toBinaryString(i4) + " but it is " + Integer.toBinaryString(this.d));
    }

    public final int b() {
        return this.f3220g ? this.f3217b - this.c : this.f3218e;
    }

    public final String toString() {
        return "State{mTargetPosition=" + this.f3216a + ", mData=null, mItemCount=" + this.f3218e + ", mIsMeasuring=" + this.f3222i + ", mPreviousLayoutItemCount=" + this.f3217b + ", mDeletedInvisibleItemCountSincePreviousLayout=" + this.c + ", mStructureChanged=" + this.f3219f + ", mInPreLayout=" + this.f3220g + ", mRunSimpleAnimations=" + this.f3223j + ", mRunPredictiveAnimations=" + this.f3224k + '}';
    }
}
