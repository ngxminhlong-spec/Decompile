package com.duracodefactory.logiccircuitsimulatorpro.view;

import B0.u;
import D0.o;
import P0.a;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.IntentFilter;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.hardware.camera2.CameraManager;
import android.media.AudioAttributes;
import android.media.MediaRecorder;
import android.media.SoundPool;
import android.os.Handler;
import android.os.Vibrator;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.widget.Scroller;
import c1.C0234c;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import e1.C1660a;
import e1.EnumC1662c;
import e1.InterfaceC1661b;
import e1.d;
import e1.e;
import e1.f;
import e1.g;
import e1.h;
import e1.j;
import e1.k;
import f1.b;
import h1.AbstractC1698a;
import j1.C1729a;
import j1.c;
import java.io.File;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.FieldPosition;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import o1.C1834J;
import o1.C1835K;
import p1.C1903A;
import p1.C1912J;
import p1.C1915a;
import p1.Q;
import q1.AbstractC1955j;
import s1.C1971a;
import s1.C1972b;
import s1.C1973c;
import s1.C1975e;
import s1.C1976f;
import s1.C1977g;
import s1.C1978h;
import s1.InterfaceC1974d;
import t2.C1995b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class BoardView extends View implements InterfaceC1661b {

    /* renamed from: A, reason: collision with root package name */
    public int f3795A;

    /* renamed from: B, reason: collision with root package name */
    public float f3796B;

    /* renamed from: C, reason: collision with root package name */
    public float f3797C;

    /* renamed from: D, reason: collision with root package name */
    public InterfaceC1974d f3798D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f3799E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f3800F;

    /* renamed from: G, reason: collision with root package name */
    public boolean f3801G;

    /* renamed from: H, reason: collision with root package name */
    public RectF f3802H;

    /* renamed from: I, reason: collision with root package name */
    public boolean f3803I;

    /* renamed from: J, reason: collision with root package name */
    public j f3804J;

    /* renamed from: K, reason: collision with root package name */
    public g f3805K;

    /* renamed from: L, reason: collision with root package name */
    public f f3806L;

    /* renamed from: M, reason: collision with root package name */
    public b f3807M;
    public RectF N;

    /* renamed from: O, reason: collision with root package name */
    public float f3808O;

    /* renamed from: P, reason: collision with root package name */
    public float f3809P;

    /* renamed from: Q, reason: collision with root package name */
    public float f3810Q;

    /* renamed from: R, reason: collision with root package name */
    public float f3811R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f3812S;

    /* renamed from: T, reason: collision with root package name */
    public int f3813T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f3814U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f3815V;

    /* renamed from: W, reason: collision with root package name */
    public int f3816W;

    /* renamed from: a0, reason: collision with root package name */
    public int f3817a0;

    /* renamed from: b0, reason: collision with root package name */
    public C1972b f3818b0;

    /* renamed from: c0, reason: collision with root package name */
    public C1972b f3819c0;

    /* renamed from: d0, reason: collision with root package name */
    public C1972b f3820d0;

    /* renamed from: o, reason: collision with root package name */
    public C1995b f3821o;

    /* renamed from: p, reason: collision with root package name */
    public ScaleGestureDetector f3822p;

    /* renamed from: q, reason: collision with root package name */
    public C1978h f3823q;

    /* renamed from: r, reason: collision with root package name */
    public GestureDetector f3824r;

    /* renamed from: s, reason: collision with root package name */
    public float f3825s;

    /* renamed from: t, reason: collision with root package name */
    public Scroller f3826t;

    /* renamed from: u, reason: collision with root package name */
    public ValueAnimator f3827u;

    /* renamed from: v, reason: collision with root package name */
    public C1975e f3828v;

    /* renamed from: w, reason: collision with root package name */
    public C1976f f3829w;

    /* renamed from: x, reason: collision with root package name */
    public float f3830x;
    public float y;

    /* renamed from: z, reason: collision with root package name */
    public float f3831z;

    public BoardView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f3825s = 1.0f;
        this.f3828v = new C1975e(this);
        this.f3829w = new C1976f(this);
        this.f3830x = 0.1f;
        this.f3796B = 0.3f;
        this.f3797C = 4.5f;
        this.f3802H = new RectF();
        this.f3806L = new f(new Handler());
        this.f3807M = new b(new C1971a(this));
        this.N = new RectF();
        this.f3818b0 = new C1972b(this, 0);
        this.f3819c0 = new C1972b(this, 1);
        this.f3820d0 = new C1972b(this, 2);
        f(context);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0ea1  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0ebc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(int r67) {
        /*
            Method dump skipped, instructions count: 3910
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.duracodefactory.logiccircuitsimulatorpro.view.BoardView.a(int):void");
    }

    public final void b(a aVar) {
        float f4;
        float f5;
        float f6 = this.f3830x;
        float f7 = this.y;
        if (f7 == 0.0f && this.f3831z == 0.0f) {
            f4 = (int) ((((getWidth() / 3.0f) + getScrollX()) / this.f3825s) / f6);
            f5 = (int) (((((getHeight() * 2) / 3.0f) + getScrollY()) / this.f3825s) / f6);
        } else {
            float f8 = this.f3795A / f6;
            f4 = f7 + f8;
            f5 = this.f3831z + f8;
        }
        aVar.f1940o = f4;
        aVar.f1941p = f5;
        this.y = f4;
        this.f3831z = f5;
        C1995b c1995b = this.f3821o;
        EnumC1662c enumC1662c = (EnumC1662c) c1995b.f14887v;
        c1995b.d(aVar);
        this.f3798D.i(enumC1662c, (EnumC1662c) this.f3821o.f14887v);
    }

    public final boolean c() {
        this.y = 0.0f;
        this.f3831z = 0.0f;
        C1995b c1995b = this.f3821o;
        C1660a c1660a = (C1660a) c1995b.f14886u;
        EnumC1662c enumC1662c = (EnumC1662c) c1995b.f14887v;
        if (enumC1662c == EnumC1662c.f12675o || enumC1662c == EnumC1662c.f12677q) {
            ArrayList arrayList = new ArrayList();
            int size = c1660a.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = c1660a.get(i4);
                i4++;
                arrayList.add(Long.valueOf(((c) obj).a()));
            }
            if (!arrayList.isEmpty()) {
                ((d) c1995b.f14880o).N(new L0.a(1, arrayList));
                c1660a.clear();
                return true;
            }
        }
        return false;
    }

    public final void d(I0.d dVar) {
        ((d) this.f3821o.f14880o).N(dVar);
    }

    public final Bitmap e(int i4) {
        C1995b c1995b = this.f3821o;
        boolean z4 = this.f3801G;
        RectF O4 = ((d) c1995b.f14880o).O();
        float f4 = O4.bottom;
        O4.bottom = O4.top;
        O4.top = f4;
        float height = O4.height();
        float width = O4.width();
        int i5 = 4000;
        float f5 = 4000;
        int i6 = (int) (f5 / (width / height));
        if (i6 > 4000) {
            i5 = (int) (f5 / (i6 / f5));
            i6 = 4000;
        }
        while (true) {
            try {
                Bitmap createBitmap = Bitmap.createBitmap(i5, i6, Bitmap.Config.ARGB_8888);
                createBitmap.eraseColor(i4);
                float f6 = i5 / width;
                Canvas canvas = new Canvas(createBitmap);
                canvas.scale(f6, f6);
                canvas.translate(-O4.left, -O4.top);
                c1995b.f(canvas, O4, z4);
                return createBitmap;
            } catch (OutOfMemoryError unused) {
                i5 /= 2;
                i6 /= 2;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, e1.g] */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, s1.h] */
    /* JADX WARN: Type inference failed for: r3v15, types: [java.lang.Object, B0.u] */
    public final void f(Context context) {
        int i4 = 2;
        this.f3824r = new GestureDetector(context, new C1834J(this, i4));
        ScaleGestureDetector scaleGestureDetector = new ScaleGestureDetector(context, new C1835K(this, i4));
        this.f3822p = scaleGestureDetector;
        scaleGestureDetector.setQuickScaleEnabled(false);
        this.f3826t = new Scroller(getContext());
        ?? obj = new Object();
        obj.f14787i = 1.0f;
        Paint paint = new Paint();
        obj.f14789k = paint;
        Paint paint2 = new Paint();
        obj.f14790l = paint2;
        obj.f14794p = new Rect();
        obj.f14795q = new DecimalFormat("#.0");
        obj.f14796r = new FieldPosition(0);
        obj.f14797s = new StringBuffer();
        obj.f14781a = 1;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(402653184);
        paint.setStrokeWidth(2.0f);
        paint2.setStyle(style);
        paint2.setColor(-1442840576);
        paint2.setTextSize(24.0f);
        int i5 = obj.f14781a;
        obj.f14788j = n0.a.f(i5) * context.getResources().getDisplayMetrics().xdpi;
        obj.f14791m = 24.0f;
        obj.f14792n = 50.0f;
        obj.f14793o = 20.0f;
        obj.a();
        this.f3823q = obj;
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f3827u = ofFloat;
        ofFloat.addUpdateListener(new G2.a(7, this));
        setLayerType(2, null);
        this.f3795A = getResources().getDimensionPixelSize(R.dimen.sequence_add_offset);
        this.f3813T = getResources().getDimensionPixelSize(R.dimen.scroll_slope);
        this.f3816W = getResources().getDimensionPixelSize(R.dimen.snap_min_distance);
        this.f3817a0 = getResources().getDimensionPixelSize(R.dimen.snap_max_distance);
        this.f3804J = new j(context);
        ?? obj2 = new Object();
        obj2.f12711f = new HashSet();
        obj2.f12712g = new HashSet();
        obj2.f12718m = new o(24, obj2);
        obj2.f12708a = context;
        ?? obj3 = new Object();
        obj3.f117p = new int[10];
        int[] iArr = new int[10];
        obj3.f118q = iArr;
        obj3.f119r = new int[10];
        SoundPool build = new SoundPool.Builder().setMaxStreams(10).setAudioAttributes(new AudioAttributes.Builder().setUsage(1).setContentType(2).build()).build();
        obj3.f120s = build;
        AssetManager assets = context.getAssets();
        try {
            iArr[0] = build.load(assets.openFd("60Hz.wav"), 1);
            iArr[1] = build.load(assets.openFd("120Hz.wav"), 1);
            iArr[2] = build.load(assets.openFd("200Hz.wav"), 1);
            iArr[3] = build.load(assets.openFd("400Hz.wav"), 1);
            iArr[4] = build.load(assets.openFd("600Hz.wav"), 1);
            iArr[5] = build.load(assets.openFd("1000Hz.wav"), 1);
            iArr[6] = build.load(assets.openFd("1600Hz.wav"), 1);
            iArr[7] = build.load(assets.openFd("2000Hz.wav"), 1);
            iArr[8] = build.load(assets.openFd("4000Hz.wav"), 1);
            iArr[9] = build.load(assets.openFd("8000Hz.wav"), 1);
        } catch (IOException e4) {
            e4.printStackTrace();
        }
        obj2.d = obj3;
        obj2.f12715j = new Handler();
        this.f3805K = obj2;
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [t2.b, java.lang.Object] */
    public final void g(a aVar) {
        f fVar = this.f3806L;
        if (!fVar.c) {
            fVar.c = true;
            if (!fVar.f12701e.isEmpty()) {
                fVar.a();
            }
        }
        b bVar = this.f3807M;
        bVar.f12959f = true;
        j jVar = this.f3804J;
        g gVar = this.f3805K;
        ?? obj = new Object();
        obj.f14886u = new C1660a(obj);
        obj.f14887v = EnumC1662c.f12675o;
        obj.f14881p = bVar;
        obj.f14882q = fVar;
        obj.f14883r = this;
        obj.f14884s = jVar;
        obj.f14885t = gVar;
        this.f3821o = obj;
        aVar.f1478w = true;
        obj.f14880o = aVar.b(new D3.d(28, (Object) obj));
    }

    public d getCircuit() {
        return (d) this.f3821o.f14880o;
    }

    public a getCircuitCreator() {
        return (a) ((d) this.f3821o.f14880o).d(0L);
    }

    public int getConnectionsCount() {
        ArrayList arrayList = ((d) this.f3821o.f14880o).f12681P;
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            if (((AbstractC1698a) obj) instanceof Q) {
                i4++;
            }
        }
        return i4;
    }

    public int getElementsCount() {
        ArrayList arrayList = ((d) this.f3821o.f14880o).f12681P;
        int size = arrayList.size();
        int i4 = 0;
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            AbstractC1698a abstractC1698a = (AbstractC1698a) obj;
            if (!(abstractC1698a instanceof C1912J) && !(abstractC1698a instanceof Q)) {
                i4++;
            }
        }
        return i4;
    }

    public HashMap<String, j1.b> getInnerLinks() {
        return ((d) this.f3821o.f14880o).f12688W;
    }

    public long getNextElementId() {
        d dVar = (d) this.f3821o.f14880o;
        long j4 = dVar.f12692a0;
        dVar.f12692a0 = 1 + j4;
        return j4;
    }

    public ArrayList<C0234c> getNodeInfos() {
        return ((d) this.f3821o.f14880o).f12687V;
    }

    public float getRealTime() {
        return this.f3806L.f12704h;
    }

    public float getScale() {
        return this.f3825s;
    }

    public float getScrollXModel() {
        return (int) ((getScrollX() / this.f3825s) / this.f3830x);
    }

    public float getScrollYModel() {
        return (int) ((getScrollY() / this.f3825s) / this.f3830x);
    }

    public AbstractC1698a getSelectedElement() {
        if (getSelectedElementsCount() != 1) {
            return null;
        }
        C1660a c1660a = (C1660a) this.f3821o.f14886u;
        if (c1660a.isEmpty()) {
            return null;
        }
        c cVar = (c) c1660a.get(0);
        if (cVar instanceof C1729a) {
            return ((C1729a) cVar).f13326o;
        }
        return null;
    }

    public ArrayList<AbstractC1698a> getSelectedElements() {
        C1995b c1995b = this.f3821o;
        c1995b.getClass();
        ArrayList<AbstractC1698a> arrayList = new ArrayList<>();
        C1660a c1660a = (C1660a) c1995b.f14886u;
        int size = c1660a.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = c1660a.get(i4);
            i4++;
            c cVar = (c) obj;
            if (cVar instanceof C1729a) {
                arrayList.add(((C1729a) cVar).f13326o);
            }
        }
        return arrayList;
    }

    public int getSelectedElementsCount() {
        C1995b c1995b = this.f3821o;
        EnumC1662c enumC1662c = (EnumC1662c) c1995b.f14887v;
        if (enumC1662c == EnumC1662c.f12675o || enumC1662c == EnumC1662c.f12677q) {
            return ((C1660a) c1995b.f14886u).size();
        }
        return 0;
    }

    public float getTimeDiagramSlowDownFactor() {
        long j4 = this.f3806L.f12699a;
        if (j4 == 0) {
            return 0.0f;
        }
        return 1500000.0f / ((float) j4);
    }

    public ArrayList<m1.b> getTimeDiagrams() {
        return ((d) this.f3821o.f14880o).f12697f0;
    }

    public final void h(boolean z4, KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 25 || keyEvent.getKeyCode() == 24) {
            j jVar = this.f3804J;
            int i4 = 0;
            boolean z5 = !z4;
            if (keyEvent.getKeyCode() == 24) {
                jVar.f12723a = z5;
            } else {
                jVar.f12724b = z5;
            }
            jVar.e();
            ArrayList arrayList = jVar.f12725e;
            int size = arrayList.size();
            while (i4 < size) {
                Object obj = arrayList.get(i4);
                i4++;
                C1915a c1915a = (C1915a) obj;
                if (c1915a.a() == -1003) {
                    c1915a.b(jVar.c);
                }
            }
        }
    }

    public final void i() {
        f fVar = this.f3806L;
        long j4 = fVar.f12706j;
        int i4 = AbstractC1955j.f14675a;
        long j5 = j4 + 16;
        fVar.f12706j = j5;
        if (j5 >= 1500) {
            fVar.f12706j = j5 - 1500;
            ArrayList arrayList = fVar.f12701e;
            int size = arrayList.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj = arrayList.get(i5);
                i5++;
                ((e) obj).b(fVar.f12703g * fVar.f12699a);
            }
            fVar.f12703g++;
        }
    }

    public final void j(HashMap hashMap, HashMap hashMap2) {
        float f4 = this.f3830x;
        float f5 = Float.MAX_VALUE;
        float f6 = Float.MAX_VALUE;
        for (W0.a aVar : hashMap.values()) {
            if (!(aVar instanceof V0.a)) {
                f5 = Math.min(aVar.f1940o, f5);
                f6 = Math.min(aVar.f1941p, f6);
            }
        }
        float f7 = this.y;
        if (f7 == 0.0f && this.f3831z == 0.0f) {
            this.y = ((((getWidth() / 4.0f) + getScrollX()) + 0.0f) / this.f3825s) / f4;
            this.f3831z = ((((getHeight() / 4.0f) + getScrollY()) + 0.0f) / this.f3825s) / f4;
        } else {
            float f8 = this.f3795A / f4;
            this.y = f7 + f8;
            this.f3831z = f8 + this.f3831z;
        }
        for (W0.a aVar2 : hashMap.values()) {
            aVar2.f1940o = (aVar2.f1940o - f5) + this.y;
            aVar2.f1941p = (aVar2.f1941p - f6) + this.f3831z;
        }
        C1995b c1995b = this.f3821o;
        EnumC1662c enumC1662c = (EnumC1662c) c1995b.f14887v;
        C1660a c1660a = (C1660a) c1995b.f14886u;
        c1660a.clear();
        ((d) c1995b.f14880o).N(new F0.a(hashMap, hashMap2));
        c1995b.r(hashMap.size() == 1 ? EnumC1662c.f12675o : EnumC1662c.f12677q);
        Iterator it = hashMap.values().iterator();
        while (it.hasNext()) {
            AbstractC1698a h4 = ((d) c1995b.f14880o).h(((W0.a) it.next()).f1942q);
            if (h4 != null && !(h4 instanceof C1903A)) {
                c1660a.add(new C1729a(h4));
            }
        }
        this.f3798D.i(enumC1662c, (EnumC1662c) this.f3821o.f14887v);
    }

    public final boolean k() {
        E0.a aVar = ((d) this.f3821o.f14880o).f12684S;
        ArrayList arrayList = (ArrayList) aVar.f709q;
        d dVar = (d) aVar.f711s;
        ArrayList arrayList2 = (ArrayList) aVar.f710r;
        if (arrayList2.isEmpty()) {
            return false;
        }
        I0.a aVar2 = (I0.a) arrayList2.remove(arrayList2.size() - 1);
        if (!arrayList.add(aVar2)) {
            arrayList2.add(aVar2);
            return false;
        }
        if (!aVar2.c(dVar)) {
            arrayList2.add(aVar2);
            arrayList.remove(arrayList.size() - 1);
            return false;
        }
        aVar.f707o++;
        BoardView boardView = (BoardView) dVar.f12683R.f14883r;
        InterfaceC1974d interfaceC1974d = boardView.f3798D;
        if (interfaceC1974d != null) {
            interfaceC1974d.m();
        }
        boardView.invalidate();
        return true;
    }

    public final boolean l() {
        C1995b c1995b = this.f3821o;
        c1995b.getClass();
        ArrayList arrayList = new ArrayList();
        C1660a c1660a = (C1660a) c1995b.f14886u;
        int size = c1660a.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = c1660a.get(i4);
            i4++;
            c cVar = (c) obj;
            if (cVar instanceof C1729a) {
                AbstractC1698a abstractC1698a = ((C1729a) cVar).f13326o;
                if (!(abstractC1698a instanceof Q) && !(abstractC1698a instanceof C1912J)) {
                    arrayList.add(Long.valueOf(abstractC1698a.f13117A));
                }
            }
        }
        if (arrayList.isEmpty()) {
            return false;
        }
        ((d) c1995b.f14880o).N(new H0.d(90, arrayList));
        return true;
    }

    public final void m() {
        this.f3826t.startScroll(getScrollX(), getScrollY(), -getScrollX(), (-getScrollY()) - getHeight());
        this.f3827u.setDuration(this.f3826t.getDuration());
        this.f3827u.start();
    }

    public final void n() {
        f fVar = this.f3806L;
        if (!fVar.c) {
            fVar.c = true;
            if (!fVar.f12701e.isEmpty()) {
                fVar.a();
            }
        }
        this.f3807M.f12959f = true;
        j jVar = this.f3804J;
        jVar.f12727g.f12737h = new C1973c(this);
        Context context = jVar.d;
        ArrayList arrayList = jVar.f12725e;
        h hVar = jVar.f12730j;
        jVar.f();
        k kVar = jVar.f12727g;
        kVar.getClass();
        kVar.f12733b = new MediaRecorder();
        if (!kVar.f12734e.isEmpty()) {
            kVar.a();
        }
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        jVar.f12726f = sensorManager;
        int i4 = 0;
        if (sensorManager != null) {
            Sensor defaultSensor = sensorManager.getDefaultSensor(8);
            if (defaultSensor != null) {
                sensorManager.registerListener(hVar, defaultSensor, 200000);
            }
            Sensor defaultSensor2 = sensorManager.getDefaultSensor(5);
            if (defaultSensor2 != null) {
                sensorManager.registerListener(hVar, defaultSensor2, 200000);
            }
            Sensor defaultSensor3 = sensorManager.getDefaultSensor(2);
            if (defaultSensor3 != null) {
                sensorManager.registerListener(hVar, defaultSensor3, 200000);
            }
            Sensor defaultSensor4 = sensorManager.getDefaultSensor(1);
            if (defaultSensor4 != null) {
                sensorManager.registerListener(hVar, defaultSensor4, 200000);
            }
            Sensor defaultSensor5 = sensorManager.getDefaultSensor(6);
            if (defaultSensor5 != null) {
                sensorManager.registerListener(hVar, defaultSensor5, 200000);
            }
            Sensor defaultSensor6 = sensorManager.getDefaultSensor(13);
            if (defaultSensor6 != null) {
                sensorManager.registerListener(hVar, defaultSensor6, 200000);
            }
            Sensor defaultSensor7 = sensorManager.getDefaultSensor(4);
            if (defaultSensor7 != null) {
                sensorManager.registerListener(hVar, defaultSensor7, 200000);
            }
            context.registerReceiver(jVar.f12731k, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            ArrayList arrayList2 = new ArrayList(arrayList.size());
            arrayList2.addAll(arrayList);
            arrayList.clear();
            int size = arrayList2.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj = arrayList2.get(i5);
                i5++;
                jVar.d((C1915a) obj);
            }
        }
        g gVar = this.f3805K;
        gVar.f12714i = new C1971a(this);
        u uVar = gVar.d;
        uVar.f121t = new C1973c(this);
        Context context2 = gVar.f12708a;
        gVar.f12709b = (Vibrator) context2.getSystemService("vibrator");
        gVar.f12713h = r4;
        long[] jArr = {0, 100};
        if (!gVar.f12711f.isEmpty()) {
            gVar.b();
        }
        CameraManager cameraManager = (CameraManager) context2.getSystemService("camera");
        gVar.c = cameraManager;
        if (cameraManager != null) {
            try {
                gVar.f12710e = cameraManager.getCameraIdList()[0];
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        if (!gVar.f12712g.isEmpty()) {
            gVar.a();
        }
        uVar.f116o = false;
        while (true) {
            int[] iArr = (int[]) uVar.f117p;
            if (i4 >= iArr.length) {
                break;
            }
            if (iArr[i4] > 0) {
                ((int[]) uVar.f119r)[i4] = ((SoundPool) uVar.f120s).play(((int[]) uVar.f118q)[i4], 0.8f, 0.8f, 1, -1, 1.0f);
                uVar.f116o = true;
            }
            i4++;
        }
        if (uVar.f116o) {
            ((C1973c) uVar.f121t).a(true);
        } else {
            uVar.f116o = true;
        }
    }

    public final void o() {
        C1976f c1976f = this.f3829w;
        RectF rectF = this.N;
        float f4 = this.f3830x;
        if (this.f3803I) {
            return;
        }
        C1995b c1995b = this.f3821o;
        C1660a c1660a = (C1660a) c1995b.f14886u;
        int size = c1660a.size();
        int i4 = 0;
        int i5 = 0;
        while (true) {
            if (i5 < size) {
                Object obj = c1660a.get(i5);
                i5++;
                c cVar = (c) obj;
                if ((cVar instanceof C1729a) && !(((C1729a) cVar).f13326o instanceof Q)) {
                    break;
                }
            } else if (!c1995b.e()) {
                return;
            }
        }
        this.f3828v.f14768e = true;
        if (this.f3800F) {
            rectF.set((getScrollX() / this.f3825s) / f4, (getScrollY() / this.f3825s) / f4, ((getWidth() + getScrollX()) / this.f3825s) / f4, ((getHeight() + getScrollY()) / this.f3825s) / f4);
            C1995b c1995b2 = this.f3821o;
            d dVar = (d) c1995b2.f14880o;
            dVar.getClass();
            ArrayList arrayList = new ArrayList();
            RectF rectF2 = new RectF();
            ArrayList arrayList2 = dVar.f12681P;
            int size2 = arrayList2.size();
            int i6 = 0;
            while (i6 < size2) {
                Object obj2 = arrayList2.get(i6);
                i6++;
                AbstractC1698a abstractC1698a = (AbstractC1698a) obj2;
                if (!(abstractC1698a instanceof Q)) {
                    abstractC1698a.l(rectF2);
                    if (RectF.intersects(rectF2, rectF)) {
                        arrayList.add(Long.valueOf(abstractC1698a.f13124q));
                        arrayList.add(Long.valueOf(abstractC1698a.f13126s));
                    }
                }
            }
            C1660a c1660a2 = (C1660a) c1995b2.f14886u;
            int size3 = c1660a2.size();
            int i7 = 0;
            while (i7 < size3) {
                Object obj3 = c1660a2.get(i7);
                i7++;
                c cVar2 = (c) obj3;
                if (cVar2 instanceof C1729a) {
                    AbstractC1698a abstractC1698a2 = ((C1729a) cVar2).f13326o;
                    arrayList.remove(Long.valueOf(abstractC1698a2.f13124q));
                    arrayList.remove(Long.valueOf(abstractC1698a2.f13126s));
                }
            }
            c1976f.f14772b = arrayList;
            C1995b c1995b3 = this.f3821o;
            d dVar2 = (d) c1995b3.f14880o;
            dVar2.getClass();
            ArrayList arrayList3 = new ArrayList();
            RectF rectF3 = new RectF();
            ArrayList arrayList4 = dVar2.f12681P;
            int size4 = arrayList4.size();
            int i8 = 0;
            while (i8 < size4) {
                Object obj4 = arrayList4.get(i8);
                i8++;
                AbstractC1698a abstractC1698a3 = (AbstractC1698a) obj4;
                if (!(abstractC1698a3 instanceof Q)) {
                    abstractC1698a3.l(rectF3);
                    if (RectF.intersects(rectF3, rectF)) {
                        arrayList3.add(Long.valueOf(abstractC1698a3.f13125r));
                        arrayList3.add(Long.valueOf(abstractC1698a3.f13127t));
                    }
                }
            }
            C1660a c1660a3 = (C1660a) c1995b3.f14886u;
            int size5 = c1660a3.size();
            while (i4 < size5) {
                Object obj5 = c1660a3.get(i4);
                i4++;
                c cVar3 = (c) obj5;
                if (cVar3 instanceof C1729a) {
                    AbstractC1698a abstractC1698a4 = ((C1729a) cVar3).f13326o;
                    arrayList3.remove(Long.valueOf(abstractC1698a4.f13125r));
                    arrayList3.remove(Long.valueOf(abstractC1698a4.f13127t));
                }
            }
            c1976f.f14771a = arrayList3;
        }
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        j jVar = this.f3804J;
        boolean z4 = configuration.orientation == 1;
        jVar.f();
        ArrayList arrayList = jVar.f12725e;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            C1915a c1915a = (C1915a) obj;
            if (c1915a.a() == -1001) {
                q2.e eVar = jVar.c;
                float[] fArr = new float[1];
                eVar.f14710q = fArr;
                fArr[0] = z4 ? 1.0f : 0.0f;
                c1915a.b(eVar);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onDraw(android.graphics.Canvas r20) {
        /*
            Method dump skipped, instructions count: 447
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.duracodefactory.logiccircuitsimulatorpro.view.BoardView.onDraw(android.graphics.Canvas):void");
    }

    @Override // android.view.View
    public final void onLayout(boolean z4, int i4, int i5, int i6, int i7) {
        super.onLayout(z4, i4, i5, i6, i7);
        this.f3804J.f();
    }

    @Override // android.view.View
    public final void onScrollChanged(int i4, int i5, int i6, int i7) {
        super.onScrollChanged(i4, i5, i6, i7);
        C1978h c1978h = this.f3823q;
        c1978h.f14785g = i4;
        c1978h.f14786h = i5;
        this.y = 0.0f;
        this.f3831z = 0.0f;
        RectF rectF = this.f3802H;
        float f4 = this.f3825s;
        float f5 = this.f3830x;
        rectF.left = (i4 / f4) / f5;
        rectF.top = (i5 / f4) / f5;
        rectF.right = ((getWidth() + i4) / this.f3825s) / f5;
        rectF.bottom = ((getHeight() + i5) / this.f3825s) / f5;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i4, int i5, int i6, int i7) {
        super.onSizeChanged(i4, i5, i6, i7);
        C1978h c1978h = this.f3823q;
        c1978h.f14783e = i4;
        c1978h.f14784f = i5;
        c1978h.a();
        scrollBy(0, i7 - i5);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z4;
        C1975e c1975e = this.f3828v;
        this.f3824r.onTouchEvent(motionEvent);
        this.f3822p.onTouchEvent(motionEvent);
        float x4 = (motionEvent.getX() + getScrollX()) / this.f3825s;
        float f4 = this.f3830x;
        float f5 = x4 / f4;
        float y = ((motionEvent.getY() + getScrollY()) / this.f3825s) / f4;
        int action = motionEvent.getAction();
        EnumC1662c enumC1662c = EnumC1662c.f12677q;
        EnumC1662c enumC1662c2 = EnumC1662c.f12675o;
        if (action == 0) {
            float x5 = motionEvent.getX();
            this.f3810Q = x5;
            this.f3808O = x5;
            float y4 = motionEvent.getY();
            this.f3811R = y4;
            this.f3809P = y4;
            this.f3826t.abortAnimation();
            this.f3827u.cancel();
            C1995b c1995b = this.f3821o;
            BoardView boardView = (BoardView) c1995b.f14883r;
            C1660a c1660a = (C1660a) c1995b.f14886u;
            c Q3 = ((d) c1995b.f14880o).Q((int) f5, (int) y);
            if (Q3 != null) {
                EnumC1662c enumC1662c3 = (EnumC1662c) c1995b.f14887v;
                if (enumC1662c3 == EnumC1662c.f12679s) {
                    if (Q3 instanceof C1729a) {
                        ((C1729a) Q3).f13326o.v();
                    }
                } else if (enumC1662c3 == enumC1662c2) {
                    if ((Q3 instanceof C1729a) && !c1660a.isEmpty() && Q3.a() == ((c) c1660a.get(0)).a()) {
                        boardView.o();
                    }
                } else if (enumC1662c3 == enumC1662c && (Q3 instanceof C1729a)) {
                    int size = c1660a.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= size) {
                            break;
                        }
                        Object obj = c1660a.get(i4);
                        i4++;
                        if (((c) obj).a() == Q3.a()) {
                            boardView.o();
                            break;
                        }
                    }
                }
            }
            c1975e.c = f5;
            c1975e.f14766a = f5;
            c1975e.d = y;
            c1975e.f14767b = y;
            z4 = true;
        } else {
            if (motionEvent.getAction() == 2) {
                if (!this.f3812S && this.f3815V) {
                    scrollBy((int) (this.f3810Q - motionEvent.getX()), (int) (this.f3811R - motionEvent.getY()));
                }
                if (this.f3815V) {
                    c1975e.a(f5, y);
                }
                this.f3810Q = motionEvent.getX();
                this.f3811R = motionEvent.getY();
            } else if (motionEvent.getAction() == 1) {
                C1995b c1995b2 = this.f3821o;
                EnumC1662c enumC1662c4 = (EnumC1662c) c1995b2.f14887v;
                if (enumC1662c4 == enumC1662c2) {
                    boolean z5 = this.f3812S;
                    if (!z5 && !this.f3815V && !c1995b2.m((int) f5, (int) y, z5)) {
                        ((C1660a) this.f3821o.f14886u).clear();
                    }
                } else if (enumC1662c4 == enumC1662c) {
                    boolean z6 = this.f3812S;
                    if (!z6 && !this.f3815V) {
                        c1995b2.m((int) f5, (int) y, z6);
                    }
                } else if (c1995b2.m((int) f5, (int) y, this.f3812S)) {
                    C1995b c1995b3 = this.f3821o;
                    if (((EnumC1662c) c1995b3.f14887v) == EnumC1662c.f12676p) {
                        this.f3798D.j((j1.b) ((c) ((C1660a) c1995b3.f14886u).get(0)));
                    }
                }
                this.f3812S = false;
                this.f3814U = false;
                this.f3815V = false;
                c1975e.b();
            }
            z4 = false;
        }
        invalidate();
        return z4 || super.onTouchEvent(motionEvent);
    }

    public final void p() {
        f fVar = this.f3806L;
        fVar.c = false;
        fVar.f12699a = 0L;
        fVar.f12703g = 0L;
        fVar.f12704h = 1.0f;
        this.f3807M.f12959f = false;
        j jVar = this.f3804J;
        k kVar = jVar.f12727g;
        kVar.b();
        kVar.f12733b = null;
        try {
            new File(kVar.f12732a.getFilesDir() + "/temp_mic_rec").delete();
        } catch (Throwable unused) {
        }
        SensorManager sensorManager = jVar.f12726f;
        if (sensorManager != null) {
            sensorManager.unregisterListener(jVar.f12730j);
            jVar.f12726f = null;
            jVar.d.unregisterReceiver(jVar.f12731k);
        }
        g gVar = this.f3805K;
        Vibrator vibrator = gVar.f12709b;
        if (vibrator != null) {
            vibrator.cancel();
            C1972b c1972b = gVar.f12714i.f14763a.f3818b0;
            if (c1972b.f12955a) {
                c1972b.f12955a = false;
            }
        }
        gVar.f12709b = null;
        gVar.c();
        gVar.c = null;
        u uVar = gVar.d;
        uVar.f116o = false;
        int i4 = 0;
        while (true) {
            int[] iArr = (int[]) uVar.f117p;
            if (i4 >= iArr.length) {
                break;
            }
            if (iArr[i4] > 0) {
                ((SoundPool) uVar.f120s).stop(((int[]) uVar.f119r)[i4]);
            }
            i4++;
        }
        C1973c c1973c = (C1973c) uVar.f121t;
        if (c1973c != null) {
            c1973c.a(false);
        }
        g gVar2 = this.f3805K;
        gVar2.f12714i = null;
        gVar2.d.f121t = null;
    }

    @Override // android.view.View
    public final void scrollBy(int i4, int i5) {
        if (this.f3828v.f14768e) {
            return;
        }
        super.scrollBy(i4, i5);
    }

    public void setGridProperties(C1977g c1977g) {
        C1978h c1978h = this.f3823q;
        Context context = getContext();
        c1978h.getClass();
        c1978h.f14781a = c1977g.f14780f;
        Paint paint = c1978h.f14789k;
        Paint.Style style = Paint.Style.FILL;
        paint.setStyle(style);
        paint.setColor(c1977g.d);
        paint.setStrokeWidth(c1977g.f14779e);
        Paint paint2 = c1978h.f14790l;
        paint2.setStyle(style);
        paint2.setColor(c1977g.f14778b);
        float f4 = c1977g.f14777a;
        paint2.setTextSize(f4);
        int i4 = c1978h.f14781a;
        c1978h.f14788j = n0.a.f(i4) * context.getResources().getDisplayMetrics().xdpi;
        c1978h.f14791m = f4;
        c1978h.f14792n = 50.0f;
        c1978h.f14793o = c1977g.c;
        c1978h.a();
    }

    public void setGridVisibility(boolean z4) {
        this.f3799E = z4;
    }

    public void setLabelsVisible(boolean z4) {
        this.f3801G = z4;
    }

    public void setListener(InterfaceC1974d interfaceC1974d) {
        this.f3798D = interfaceC1974d;
    }

    public void setScale(float f4) {
        this.f3825s = f4;
    }

    public void setScrollXModel(float f4) {
        scrollTo((int) (f4 * this.f3825s * this.f3830x), getScrollY());
    }

    public void setScrollYModel(float f4) {
        scrollTo(getScrollX(), (int) (f4 * this.f3825s * this.f3830x));
    }

    public void setSelectionMode(EnumC1662c enumC1662c) {
        C1995b c1995b = this.f3821o;
        EnumC1662c enumC1662c2 = (EnumC1662c) c1995b.f14887v;
        c1995b.r(enumC1662c);
        this.f3798D.i(enumC1662c2, enumC1662c);
        invalidate();
    }

    public void setSnappingEnabled(boolean z4) {
        this.f3800F = z4;
    }

    public void setVibrateOnPath(boolean z4) {
        this.f3805K.f12717l = z4;
    }
}
