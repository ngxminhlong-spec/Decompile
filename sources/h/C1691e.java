package h;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import g2.x;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: h.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1691e extends Drawable implements Drawable.Callback {

    /* renamed from: H, reason: collision with root package name */
    public static final /* synthetic */ int f13079H = 0;

    /* renamed from: A, reason: collision with root package name */
    public C1688b f13080A;

    /* renamed from: B, reason: collision with root package name */
    public boolean f13081B;

    /* renamed from: C, reason: collision with root package name */
    public C1688b f13082C;

    /* renamed from: D, reason: collision with root package name */
    public android.support.v4.media.session.a f13083D;

    /* renamed from: G, reason: collision with root package name */
    public boolean f13086G;

    /* renamed from: o, reason: collision with root package name */
    public C1688b f13087o;

    /* renamed from: p, reason: collision with root package name */
    public Rect f13088p;

    /* renamed from: q, reason: collision with root package name */
    public Drawable f13089q;

    /* renamed from: r, reason: collision with root package name */
    public Drawable f13090r;

    /* renamed from: t, reason: collision with root package name */
    public boolean f13092t;

    /* renamed from: v, reason: collision with root package name */
    public boolean f13094v;

    /* renamed from: w, reason: collision with root package name */
    public x f13095w;

    /* renamed from: x, reason: collision with root package name */
    public long f13096x;
    public long y;

    /* renamed from: z, reason: collision with root package name */
    public C1692f f13097z;

    /* renamed from: s, reason: collision with root package name */
    public int f13091s = 255;

    /* renamed from: u, reason: collision with root package name */
    public int f13093u = -1;

    /* renamed from: E, reason: collision with root package name */
    public int f13084E = -1;

    /* renamed from: F, reason: collision with root package name */
    public int f13085F = -1;

    public C1691e(C1688b c1688b, Resources resources) {
        i(new C1688b(c1688b, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0272, code lost:
    
        r5.onStateChange(r5.getState());
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0279, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00f9, code lost:
    
        if (r6 == null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00fb, code lost:
    
        r6 = r26.next();
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0100, code lost:
    
        if (r6 != 4) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0104, code lost:
    
        if (r6 != 2) goto L106;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0110, code lost:
    
        if (r26.getName().equals("vector") == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0112, code lost:
    
        r6 = new l0.n();
        r6.inflate(r1, r26, r27, r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x011b, code lost:
    
        r6 = android.graphics.drawable.Drawable.createFromXmlInner(r25, r26, r27, r28);
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0138, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r26.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0139, code lost:
    
        if (r6 == null) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x013b, code lost:
    
        r9 = r5.f13082C;
        r6 = r9.a(r6);
        r9.f13050H[r6] = r8;
        r9.f13052J.e(r6, java.lang.Integer.valueOf(r15));
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x016d, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException(r26.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static h.C1691e c(android.content.Context r24, android.content.res.Resources r25, android.content.res.XmlResourceParser r26, android.util.AttributeSet r27, android.content.res.Resources.Theme r28) {
        /*
            Method dump skipped, instructions count: 664
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h.C1691e.c(android.content.Context, android.content.res.Resources, android.content.res.XmlResourceParser, android.util.AttributeSet, android.content.res.Resources$Theme):h.e");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(boolean r14) {
        /*
            r13 = this;
            r0 = 1
            r13.f13092t = r0
            long r1 = android.os.SystemClock.uptimeMillis()
            android.graphics.drawable.Drawable r3 = r13.f13089q
            r4 = 255(0xff, double:1.26E-321)
            r6 = 0
            r8 = 0
            if (r3 == 0) goto L36
            long r9 = r13.f13096x
            int r11 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r11 == 0) goto L38
            int r11 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r11 > 0) goto L22
            int r9 = r13.f13091s
            r3.setAlpha(r9)
            r13.f13096x = r6
            goto L38
        L22:
            long r9 = r9 - r1
            long r9 = r9 * r4
            int r9 = (int) r9
            h.b r10 = r13.f13087o
            int r10 = r10.y
            int r9 = r9 / r10
            int r9 = 255 - r9
            int r10 = r13.f13091s
            int r9 = r9 * r10
            int r9 = r9 / 255
            r3.setAlpha(r9)
            r3 = r0
            goto L39
        L36:
            r13.f13096x = r6
        L38:
            r3 = r8
        L39:
            android.graphics.drawable.Drawable r9 = r13.f13090r
            if (r9 == 0) goto L61
            long r10 = r13.y
            int r12 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r12 == 0) goto L63
            int r12 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r12 > 0) goto L50
            r9.setVisible(r8, r8)
            r0 = 0
            r13.f13090r = r0
            r13.y = r6
            goto L63
        L50:
            long r10 = r10 - r1
            long r10 = r10 * r4
            int r3 = (int) r10
            h.b r4 = r13.f13087o
            int r4 = r4.f13075z
            int r3 = r3 / r4
            int r4 = r13.f13091s
            int r3 = r3 * r4
            int r3 = r3 / 255
            r9.setAlpha(r3)
            goto L64
        L61:
            r13.y = r6
        L63:
            r0 = r3
        L64:
            if (r14 == 0) goto L70
            if (r0 == 0) goto L70
            g2.x r14 = r13.f13095w
            r3 = 16
            long r1 = r1 + r3
            r13.scheduleSelf(r14, r1)
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h.C1691e.a(boolean):void");
    }

    @Override // android.graphics.drawable.Drawable
    public final void applyTheme(Resources.Theme theme) {
        b(theme);
        onStateChange(getState());
    }

    public final void b(Resources.Theme theme) {
        C1688b c1688b = this.f13087o;
        if (theme == null) {
            c1688b.getClass();
            return;
        }
        c1688b.c();
        int i4 = c1688b.f13058h;
        Drawable[] drawableArr = c1688b.f13057g;
        for (int i5 = 0; i5 < i4; i5++) {
            Drawable drawable = drawableArr[i5];
            if (drawable != null && drawable.canApplyTheme()) {
                drawableArr[i5].applyTheme(theme);
                c1688b.f13055e |= drawableArr[i5].getChangingConfigurations();
            }
        }
        Resources resources = theme.getResources();
        if (resources != null) {
            c1688b.f13054b = resources;
            int i6 = resources.getDisplayMetrics().densityDpi;
            if (i6 == 0) {
                i6 = 160;
            }
            int i7 = c1688b.c;
            c1688b.c = i6;
            if (i7 != i6) {
                c1688b.f13063m = false;
                c1688b.f13060j = false;
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean canApplyTheme() {
        return this.f13087o.canApplyTheme();
    }

    public final void d(Drawable drawable) {
        if (this.f13097z == null) {
            this.f13097z = new C1692f();
        }
        C1692f c1692f = this.f13097z;
        c1692f.f13099p = drawable.getCallback();
        drawable.setCallback(c1692f);
        try {
            if (this.f13087o.y <= 0 && this.f13092t) {
                drawable.setAlpha(this.f13091s);
            }
            C1688b c1688b = this.f13087o;
            if (c1688b.f13045C) {
                drawable.setColorFilter(c1688b.f13044B);
            } else {
                if (c1688b.f13048F) {
                    drawable.setTintList(c1688b.f13046D);
                }
                C1688b c1688b2 = this.f13087o;
                if (c1688b2.f13049G) {
                    drawable.setTintMode(c1688b2.f13047E);
                }
            }
            drawable.setVisible(isVisible(), true);
            drawable.setDither(this.f13087o.f13073w);
            drawable.setState(getState());
            drawable.setLevel(getLevel());
            drawable.setBounds(getBounds());
            drawable.setLayoutDirection(getLayoutDirection());
            drawable.setAutoMirrored(this.f13087o.f13043A);
            Rect rect = this.f13088p;
            if (rect != null) {
                drawable.setHotspotBounds(rect.left, rect.top, rect.right, rect.bottom);
            }
            C1692f c1692f2 = this.f13097z;
            Drawable.Callback callback = (Drawable.Callback) c1692f2.f13099p;
            c1692f2.f13099p = null;
            drawable.setCallback(callback);
        } catch (Throwable th) {
            C1692f c1692f3 = this.f13097z;
            Drawable.Callback callback2 = (Drawable.Callback) c1692f3.f13099p;
            c1692f3.f13099p = null;
            drawable.setCallback(callback2);
            throw th;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        Drawable drawable = this.f13089q;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.f13090r;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
    }

    public final void e() {
        boolean z4;
        Drawable drawable = this.f13090r;
        boolean z5 = true;
        if (drawable != null) {
            drawable.jumpToCurrentState();
            this.f13090r = null;
            z4 = true;
        } else {
            z4 = false;
        }
        Drawable drawable2 = this.f13089q;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
            if (this.f13092t) {
                this.f13089q.setAlpha(this.f13091s);
            }
        }
        if (this.y != 0) {
            this.y = 0L;
            z4 = true;
        }
        if (this.f13096x != 0) {
            this.f13096x = 0L;
        } else {
            z5 = z4;
        }
        if (z5) {
            invalidateSelf();
        }
    }

    public final Drawable f() {
        if (!this.f13094v && super.mutate() == this) {
            C1688b c1688b = new C1688b(this.f13082C, this, null);
            c1688b.f13051I = c1688b.f13051I.clone();
            c1688b.f13052J = c1688b.f13052J.clone();
            i(c1688b);
            this.f13094v = true;
        }
        return this;
    }

    public final Drawable g() {
        if (!this.f13081B) {
            f();
            C1688b c1688b = this.f13080A;
            c1688b.f13051I = c1688b.f13051I.clone();
            c1688b.f13052J = c1688b.f13052J.clone();
            this.f13081B = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.f13091s;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getChangingConfigurations() {
        return super.getChangingConfigurations() | this.f13087o.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable.ConstantState getConstantState() {
        boolean z4;
        C1688b c1688b = this.f13087o;
        synchronized (c1688b) {
            if (!c1688b.f13071u) {
                c1688b.c();
                z4 = true;
                c1688b.f13071u = true;
                int i4 = c1688b.f13058h;
                Drawable[] drawableArr = c1688b.f13057g;
                int i5 = 0;
                while (true) {
                    if (i5 >= i4) {
                        c1688b.f13072v = true;
                        break;
                    }
                    if (drawableArr[i5].getConstantState() == null) {
                        c1688b.f13072v = false;
                        z4 = false;
                        break;
                    }
                    i5++;
                }
            } else {
                z4 = c1688b.f13072v;
            }
        }
        if (!z4) {
            return null;
        }
        this.f13087o.d = getChangingConfigurations();
        return this.f13087o;
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable getCurrent() {
        return this.f13089q;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getHotspotBounds(Rect rect) {
        Rect rect2 = this.f13088p;
        if (rect2 != null) {
            rect.set(rect2);
        } else {
            super.getHotspotBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        C1688b c1688b = this.f13087o;
        if (c1688b.f13062l) {
            if (!c1688b.f13063m) {
                c1688b.b();
            }
            return c1688b.f13065o;
        }
        Drawable drawable = this.f13089q;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        C1688b c1688b = this.f13087o;
        if (c1688b.f13062l) {
            if (!c1688b.f13063m) {
                c1688b.b();
            }
            return c1688b.f13064n;
        }
        Drawable drawable = this.f13089q;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumHeight() {
        C1688b c1688b = this.f13087o;
        if (c1688b.f13062l) {
            if (!c1688b.f13063m) {
                c1688b.b();
            }
            return c1688b.f13067q;
        }
        Drawable drawable = this.f13089q;
        if (drawable != null) {
            return drawable.getMinimumHeight();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getMinimumWidth() {
        C1688b c1688b = this.f13087o;
        if (c1688b.f13062l) {
            if (!c1688b.f13063m) {
                c1688b.b();
            }
            return c1688b.f13066p;
        }
        Drawable drawable = this.f13089q;
        if (drawable != null) {
            return drawable.getMinimumWidth();
        }
        return 0;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        Drawable drawable = this.f13089q;
        if (drawable != null && drawable.isVisible()) {
            C1688b c1688b = this.f13087o;
            if (c1688b.f13068r) {
                return c1688b.f13069s;
            }
            c1688b.c();
            int i4 = c1688b.f13058h;
            Drawable[] drawableArr = c1688b.f13057g;
            r1 = i4 > 0 ? drawableArr[0].getOpacity() : -2;
            for (int i5 = 1; i5 < i4; i5++) {
                r1 = Drawable.resolveOpacity(r1, drawableArr[i5].getOpacity());
            }
            c1688b.f13069s = r1;
            c1688b.f13068r = true;
        }
        return r1;
    }

    @Override // android.graphics.drawable.Drawable
    public final void getOutline(Outline outline) {
        Drawable drawable = this.f13089q;
        if (drawable != null) {
            drawable.getOutline(outline);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean getPadding(Rect rect) {
        C1688b c1688b = this.f13087o;
        Rect rect2 = null;
        boolean z4 = false;
        if (!c1688b.f13059i) {
            Rect rect3 = c1688b.f13061k;
            if (rect3 != null || c1688b.f13060j) {
                rect2 = rect3;
            } else {
                c1688b.c();
                Rect rect4 = new Rect();
                int i4 = c1688b.f13058h;
                Drawable[] drawableArr = c1688b.f13057g;
                for (int i5 = 0; i5 < i4; i5++) {
                    if (drawableArr[i5].getPadding(rect4)) {
                        if (rect2 == null) {
                            rect2 = new Rect(0, 0, 0, 0);
                        }
                        int i6 = rect4.left;
                        if (i6 > rect2.left) {
                            rect2.left = i6;
                        }
                        int i7 = rect4.top;
                        if (i7 > rect2.top) {
                            rect2.top = i7;
                        }
                        int i8 = rect4.right;
                        if (i8 > rect2.right) {
                            rect2.right = i8;
                        }
                        int i9 = rect4.bottom;
                        if (i9 > rect2.bottom) {
                            rect2.bottom = i9;
                        }
                    }
                }
                c1688b.f13060j = true;
                c1688b.f13061k = rect2;
            }
        }
        if (rect2 != null) {
            rect.set(rect2);
            if ((rect2.left | rect2.top | rect2.bottom | rect2.right) != 0) {
                z4 = true;
            }
        } else {
            Drawable drawable = this.f13089q;
            z4 = drawable != null ? drawable.getPadding(rect) : super.getPadding(rect);
        }
        if (this.f13087o.f13043A && getLayoutDirection() == 1) {
            int i10 = rect.left;
            rect.left = rect.right;
            rect.right = i10;
        }
        return z4;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0074  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean h(int r10) {
        /*
            r9 = this;
            int r0 = r9.f13093u
            r1 = 0
            if (r10 != r0) goto L6
            return r1
        L6:
            long r2 = android.os.SystemClock.uptimeMillis()
            h.b r0 = r9.f13087o
            int r0 = r0.f13075z
            r4 = 0
            r5 = 0
            if (r0 <= 0) goto L2e
            android.graphics.drawable.Drawable r0 = r9.f13090r
            if (r0 == 0) goto L1a
            r0.setVisible(r1, r1)
        L1a:
            android.graphics.drawable.Drawable r0 = r9.f13089q
            if (r0 == 0) goto L29
            r9.f13090r = r0
            h.b r0 = r9.f13087o
            int r0 = r0.f13075z
            long r0 = (long) r0
            long r0 = r0 + r2
            r9.y = r0
            goto L35
        L29:
            r9.f13090r = r4
            r9.y = r5
            goto L35
        L2e:
            android.graphics.drawable.Drawable r0 = r9.f13089q
            if (r0 == 0) goto L35
            r0.setVisible(r1, r1)
        L35:
            if (r10 < 0) goto L55
            h.b r0 = r9.f13087o
            int r1 = r0.f13058h
            if (r10 >= r1) goto L55
            android.graphics.drawable.Drawable r0 = r0.d(r10)
            r9.f13089q = r0
            r9.f13093u = r10
            if (r0 == 0) goto L5a
            h.b r10 = r9.f13087o
            int r10 = r10.y
            if (r10 <= 0) goto L51
            long r7 = (long) r10
            long r2 = r2 + r7
            r9.f13096x = r2
        L51:
            r9.d(r0)
            goto L5a
        L55:
            r9.f13089q = r4
            r10 = -1
            r9.f13093u = r10
        L5a:
            long r0 = r9.f13096x
            int r10 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            r0 = 1
            if (r10 != 0) goto L67
            long r1 = r9.y
            int r10 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r10 == 0) goto L7a
        L67:
            g2.x r10 = r9.f13095w
            if (r10 != 0) goto L74
            g2.x r10 = new g2.x
            r1 = 1
            r10.<init>(r1, r9)
            r9.f13095w = r10
            goto L77
        L74:
            r9.unscheduleSelf(r10)
        L77:
            r9.a(r0)
        L7a:
            r9.invalidateSelf()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h.C1691e.h(int):boolean");
    }

    public final void i(C1688b c1688b) {
        this.f13087o = c1688b;
        int i4 = this.f13093u;
        if (i4 >= 0) {
            Drawable d = c1688b.d(i4);
            this.f13089q = d;
            if (d != null) {
                d(d);
            }
        }
        this.f13090r = null;
        this.f13080A = c1688b;
        this.f13082C = c1688b;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        C1688b c1688b = this.f13087o;
        if (c1688b != null) {
            c1688b.f13068r = false;
            c1688b.f13070t = false;
        }
        if (drawable != this.f13089q || getCallback() == null) {
            return;
        }
        getCallback().invalidateDrawable(this);
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isAutoMirrored() {
        return this.f13087o.f13043A;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return true;
    }

    public final boolean j(boolean z4, boolean z5) {
        boolean visible = super.setVisible(z4, z5);
        Drawable drawable = this.f13090r;
        if (drawable != null) {
            drawable.setVisible(z4, z5);
        }
        Drawable drawable2 = this.f13089q;
        if (drawable2 != null) {
            drawable2.setVisible(z4, z5);
        }
        return visible;
    }

    @Override // android.graphics.drawable.Drawable
    public final void jumpToCurrentState() {
        e();
        android.support.v4.media.session.a aVar = this.f13083D;
        if (aVar != null) {
            aVar.u();
            this.f13083D = null;
            h(this.f13084E);
            this.f13084E = -1;
            this.f13085F = -1;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final Drawable mutate() {
        if (!this.f13086G) {
            g();
            C1688b c1688b = this.f13082C;
            c1688b.f13051I = c1688b.f13051I.clone();
            c1688b.f13052J = c1688b.f13052J.clone();
            this.f13086G = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.f13090r;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
        Drawable drawable2 = this.f13089q;
        if (drawable2 != null) {
            drawable2.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLayoutDirectionChanged(int i4) {
        C1688b c1688b = this.f13087o;
        int i5 = this.f13093u;
        int i6 = c1688b.f13058h;
        Drawable[] drawableArr = c1688b.f13057g;
        boolean z4 = false;
        for (int i7 = 0; i7 < i6; i7++) {
            Drawable drawable = drawableArr[i7];
            if (drawable != null) {
                boolean layoutDirection = drawable.setLayoutDirection(i4);
                if (i7 == i5) {
                    z4 = layoutDirection;
                }
            }
        }
        c1688b.f13074x = i4;
        return z4;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean onLevelChange(int i4) {
        Drawable drawable = this.f13090r;
        if (drawable != null) {
            return drawable.setLevel(i4);
        }
        Drawable drawable2 = this.f13089q;
        if (drawable2 != null) {
            return drawable2.setLevel(i4);
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x00d1, code lost:
    
        if (h(r1) != false) goto L45;
     */
    @Override // android.graphics.drawable.Drawable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onStateChange(int[] r15) {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h.C1691e.onStateChange(int[]):boolean");
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j4) {
        if (drawable != this.f13089q || getCallback() == null) {
            return;
        }
        getCallback().scheduleDrawable(this, runnable, j4);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i4) {
        if (this.f13092t && this.f13091s == i4) {
            return;
        }
        this.f13092t = true;
        this.f13091s = i4;
        Drawable drawable = this.f13089q;
        if (drawable != null) {
            if (this.f13096x == 0) {
                drawable.setAlpha(i4);
            } else {
                a(false);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAutoMirrored(boolean z4) {
        C1688b c1688b = this.f13087o;
        if (c1688b.f13043A != z4) {
            c1688b.f13043A = z4;
            Drawable drawable = this.f13089q;
            if (drawable != null) {
                drawable.setAutoMirrored(z4);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        C1688b c1688b = this.f13087o;
        c1688b.f13045C = true;
        if (c1688b.f13044B != colorFilter) {
            c1688b.f13044B = colorFilter;
            Drawable drawable = this.f13089q;
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setDither(boolean z4) {
        C1688b c1688b = this.f13087o;
        if (c1688b.f13073w != z4) {
            c1688b.f13073w = z4;
            Drawable drawable = this.f13089q;
            if (drawable != null) {
                drawable.setDither(z4);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspot(float f4, float f5) {
        Drawable drawable = this.f13089q;
        if (drawable != null) {
            drawable.setHotspot(f4, f5);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setHotspotBounds(int i4, int i5, int i6, int i7) {
        Rect rect = this.f13088p;
        if (rect == null) {
            this.f13088p = new Rect(i4, i5, i6, i7);
        } else {
            rect.set(i4, i5, i6, i7);
        }
        Drawable drawable = this.f13089q;
        if (drawable != null) {
            drawable.setHotspotBounds(i4, i5, i6, i7);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintList(ColorStateList colorStateList) {
        C1688b c1688b = this.f13087o;
        c1688b.f13048F = true;
        if (c1688b.f13046D != colorStateList) {
            c1688b.f13046D = colorStateList;
            this.f13089q.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setTintMode(PorterDuff.Mode mode) {
        C1688b c1688b = this.f13087o;
        c1688b.f13049G = true;
        if (c1688b.f13047E != mode) {
            c1688b.f13047E = mode;
            this.f13089q.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean setVisible(boolean z4, boolean z5) {
        boolean j4 = j(z4, z5);
        android.support.v4.media.session.a aVar = this.f13083D;
        if (aVar != null && (j4 || z5)) {
            if (z4) {
                aVar.t();
                return j4;
            }
            jumpToCurrentState();
        }
        return j4;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        if (drawable != this.f13089q || getCallback() == null) {
            return;
        }
        getCallback().unscheduleDrawable(this, runnable);
    }
}
