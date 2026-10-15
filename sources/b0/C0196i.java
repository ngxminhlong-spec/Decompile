package b0;

import android.R;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: b0.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0196i extends AbstractC0176J implements InterfaceC0181O {

    /* renamed from: C, reason: collision with root package name */
    public static final int[] f3297C = {R.attr.state_pressed};

    /* renamed from: D, reason: collision with root package name */
    public static final int[] f3298D = new int[0];

    /* renamed from: A, reason: collision with root package name */
    public int f3299A;

    /* renamed from: B, reason: collision with root package name */
    public final D0.o f3300B;

    /* renamed from: a, reason: collision with root package name */
    public final int f3301a;

    /* renamed from: b, reason: collision with root package name */
    public final int f3302b;
    public final StateListDrawable c;
    public final Drawable d;

    /* renamed from: e, reason: collision with root package name */
    public final int f3303e;

    /* renamed from: f, reason: collision with root package name */
    public final int f3304f;

    /* renamed from: g, reason: collision with root package name */
    public final StateListDrawable f3305g;

    /* renamed from: h, reason: collision with root package name */
    public final Drawable f3306h;

    /* renamed from: i, reason: collision with root package name */
    public final int f3307i;

    /* renamed from: j, reason: collision with root package name */
    public final int f3308j;

    /* renamed from: k, reason: collision with root package name */
    public int f3309k;

    /* renamed from: l, reason: collision with root package name */
    public int f3310l;

    /* renamed from: m, reason: collision with root package name */
    public float f3311m;

    /* renamed from: n, reason: collision with root package name */
    public int f3312n;

    /* renamed from: o, reason: collision with root package name */
    public int f3313o;

    /* renamed from: p, reason: collision with root package name */
    public float f3314p;

    /* renamed from: s, reason: collision with root package name */
    public final RecyclerView f3317s;

    /* renamed from: z, reason: collision with root package name */
    public final ValueAnimator f3323z;

    /* renamed from: q, reason: collision with root package name */
    public int f3315q = 0;

    /* renamed from: r, reason: collision with root package name */
    public int f3316r = 0;

    /* renamed from: t, reason: collision with root package name */
    public boolean f3318t = false;

    /* renamed from: u, reason: collision with root package name */
    public boolean f3319u = false;

    /* renamed from: v, reason: collision with root package name */
    public int f3320v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f3321w = 0;

    /* renamed from: x, reason: collision with root package name */
    public final int[] f3322x = new int[2];
    public final int[] y = new int[2];

    public C0196i(RecyclerView recyclerView, StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2, int i4, int i5, int i6) {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f3323z = ofFloat;
        this.f3299A = 0;
        D0.o oVar = new D0.o(19, this);
        this.f3300B = oVar;
        C0.k0 k0Var = new C0.k0(2, this);
        this.c = stateListDrawable;
        this.d = drawable;
        this.f3305g = stateListDrawable2;
        this.f3306h = drawable2;
        this.f3303e = Math.max(i4, stateListDrawable.getIntrinsicWidth());
        this.f3304f = Math.max(i4, drawable.getIntrinsicWidth());
        this.f3307i = Math.max(i4, stateListDrawable2.getIntrinsicWidth());
        this.f3308j = Math.max(i4, drawable2.getIntrinsicWidth());
        this.f3301a = i5;
        this.f3302b = i6;
        stateListDrawable.setAlpha(255);
        drawable.setAlpha(255);
        ofFloat.addListener(new O2.d(this));
        ofFloat.addUpdateListener(new G2.a(3, this));
        RecyclerView recyclerView2 = this.f3317s;
        if (recyclerView2 == recyclerView) {
            return;
        }
        if (recyclerView2 != null) {
            recyclerView2.X(this);
            RecyclerView recyclerView3 = this.f3317s;
            recyclerView3.f3029C.remove(this);
            if (recyclerView3.f3031D == this) {
                recyclerView3.f3031D = null;
            }
            ArrayList arrayList = this.f3317s.f3085v0;
            if (arrayList != null) {
                arrayList.remove(k0Var);
            }
            this.f3317s.removeCallbacks(oVar);
        }
        this.f3317s = recyclerView;
        recyclerView.g(this);
        this.f3317s.f3029C.add(this);
        this.f3317s.h(k0Var);
    }

    public static int i(float f4, float f5, int[] iArr, int i4, int i5, int i6) {
        int i7 = iArr[1] - iArr[0];
        if (i7 != 0) {
            int i8 = i4 - i6;
            int i9 = (int) (((f5 - f4) / i7) * i8);
            int i10 = i5 + i9;
            if (i10 < i8 && i10 >= 0) {
                return i9;
            }
        }
        return 0;
    }

    @Override // b0.InterfaceC0181O
    public final void a(MotionEvent motionEvent) {
        if (this.f3320v == 0) {
            return;
        }
        if (motionEvent.getAction() == 0) {
            boolean h4 = h(motionEvent.getX(), motionEvent.getY());
            boolean g4 = g(motionEvent.getX(), motionEvent.getY());
            if (h4 || g4) {
                if (g4) {
                    this.f3321w = 1;
                    this.f3314p = (int) motionEvent.getX();
                } else if (h4) {
                    this.f3321w = 2;
                    this.f3311m = (int) motionEvent.getY();
                }
                j(2);
                return;
            }
            return;
        }
        if (motionEvent.getAction() == 1 && this.f3320v == 2) {
            this.f3311m = 0.0f;
            this.f3314p = 0.0f;
            j(1);
            this.f3321w = 0;
            return;
        }
        if (motionEvent.getAction() == 2 && this.f3320v == 2) {
            k();
            int i4 = this.f3321w;
            int i5 = this.f3302b;
            if (i4 == 1) {
                float x4 = motionEvent.getX();
                int[] iArr = this.y;
                iArr[0] = i5;
                int i6 = this.f3315q - i5;
                iArr[1] = i6;
                float max = Math.max(i5, Math.min(i6, x4));
                if (Math.abs(this.f3313o - max) >= 2.0f) {
                    int i7 = i(this.f3314p, max, iArr, this.f3317s.computeHorizontalScrollRange(), this.f3317s.computeHorizontalScrollOffset(), this.f3315q);
                    if (i7 != 0) {
                        this.f3317s.scrollBy(i7, 0);
                    }
                    this.f3314p = max;
                }
            }
            if (this.f3321w == 2) {
                float y = motionEvent.getY();
                int[] iArr2 = this.f3322x;
                iArr2[0] = i5;
                int i8 = this.f3316r - i5;
                iArr2[1] = i8;
                float max2 = Math.max(i5, Math.min(i8, y));
                if (Math.abs(this.f3310l - max2) < 2.0f) {
                    return;
                }
                int i9 = i(this.f3311m, max2, iArr2, this.f3317s.computeVerticalScrollRange(), this.f3317s.computeVerticalScrollOffset(), this.f3316r);
                if (i9 != 0) {
                    this.f3317s.scrollBy(0, i9);
                }
                this.f3311m = max2;
            }
        }
    }

    @Override // b0.InterfaceC0181O
    public final boolean b(MotionEvent motionEvent) {
        int i4 = this.f3320v;
        if (i4 != 1) {
            return i4 == 2;
        }
        boolean h4 = h(motionEvent.getX(), motionEvent.getY());
        boolean g4 = g(motionEvent.getX(), motionEvent.getY());
        if (motionEvent.getAction() != 0) {
            return false;
        }
        if (!h4 && !g4) {
            return false;
        }
        if (g4) {
            this.f3321w = 1;
            this.f3314p = (int) motionEvent.getX();
        } else if (h4) {
            this.f3321w = 2;
            this.f3311m = (int) motionEvent.getY();
        }
        j(2);
        return true;
    }

    @Override // b0.InterfaceC0181O
    public final void c(boolean z4) {
    }

    @Override // b0.AbstractC0176J
    public final void f(Canvas canvas, RecyclerView recyclerView) {
        int i4 = this.f3315q;
        RecyclerView recyclerView2 = this.f3317s;
        if (i4 != recyclerView2.getWidth() || this.f3316r != recyclerView2.getHeight()) {
            this.f3315q = recyclerView2.getWidth();
            this.f3316r = recyclerView2.getHeight();
            j(0);
            return;
        }
        if (this.f3299A != 0) {
            if (this.f3318t) {
                int i5 = this.f3315q;
                int i6 = this.f3303e;
                int i7 = i5 - i6;
                int i8 = this.f3310l;
                int i9 = this.f3309k;
                int i10 = i8 - (i9 / 2);
                StateListDrawable stateListDrawable = this.c;
                stateListDrawable.setBounds(0, 0, i6, i9);
                int i11 = this.f3304f;
                int i12 = this.f3316r;
                Drawable drawable = this.d;
                drawable.setBounds(0, 0, i11, i12);
                WeakHashMap weakHashMap = H.A.f779a;
                if (recyclerView2.getLayoutDirection() == 1) {
                    drawable.draw(canvas);
                    canvas.translate(i6, i10);
                    canvas.scale(-1.0f, 1.0f);
                    stateListDrawable.draw(canvas);
                    canvas.scale(1.0f, 1.0f);
                    canvas.translate(-i6, -i10);
                } else {
                    canvas.translate(i7, 0.0f);
                    drawable.draw(canvas);
                    canvas.translate(0.0f, i10);
                    stateListDrawable.draw(canvas);
                    canvas.translate(-i7, -i10);
                }
            }
            if (this.f3319u) {
                int i13 = this.f3316r;
                int i14 = this.f3307i;
                int i15 = i13 - i14;
                int i16 = this.f3313o;
                int i17 = this.f3312n;
                int i18 = i16 - (i17 / 2);
                StateListDrawable stateListDrawable2 = this.f3305g;
                stateListDrawable2.setBounds(0, 0, i17, i14);
                int i19 = this.f3315q;
                int i20 = this.f3308j;
                Drawable drawable2 = this.f3306h;
                drawable2.setBounds(0, 0, i19, i20);
                canvas.translate(0.0f, i15);
                drawable2.draw(canvas);
                canvas.translate(i18, 0.0f);
                stateListDrawable2.draw(canvas);
                canvas.translate(-i18, -i15);
            }
        }
    }

    public final boolean g(float f4, float f5) {
        if (f5 < this.f3316r - this.f3307i) {
            return false;
        }
        int i4 = this.f3313o;
        int i5 = this.f3312n;
        return f4 >= ((float) (i4 - (i5 / 2))) && f4 <= ((float) ((i5 / 2) + i4));
    }

    public final boolean h(float f4, float f5) {
        WeakHashMap weakHashMap = H.A.f779a;
        int layoutDirection = this.f3317s.getLayoutDirection();
        int i4 = this.f3303e;
        if (layoutDirection == 1) {
            if (f4 > i4 / 2) {
                return false;
            }
        } else if (f4 < this.f3315q - i4) {
            return false;
        }
        int i5 = this.f3310l;
        int i6 = this.f3309k / 2;
        return f5 >= ((float) (i5 - i6)) && f5 <= ((float) (i6 + i5));
    }

    public final void j(int i4) {
        D0.o oVar = this.f3300B;
        StateListDrawable stateListDrawable = this.c;
        if (i4 == 2 && this.f3320v != 2) {
            stateListDrawable.setState(f3297C);
            this.f3317s.removeCallbacks(oVar);
        }
        if (i4 == 0) {
            this.f3317s.invalidate();
        } else {
            k();
        }
        if (this.f3320v == 2 && i4 != 2) {
            stateListDrawable.setState(f3298D);
            this.f3317s.removeCallbacks(oVar);
            this.f3317s.postDelayed(oVar, 1200);
        } else if (i4 == 1) {
            this.f3317s.removeCallbacks(oVar);
            this.f3317s.postDelayed(oVar, 1500);
        }
        this.f3320v = i4;
    }

    public final void k() {
        int i4 = this.f3299A;
        ValueAnimator valueAnimator = this.f3323z;
        if (i4 != 0) {
            if (i4 != 3) {
                return;
            } else {
                valueAnimator.cancel();
            }
        }
        this.f3299A = 1;
        valueAnimator.setFloatValues(((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
        valueAnimator.setDuration(500L);
        valueAnimator.setStartDelay(0L);
        valueAnimator.start();
    }
}
