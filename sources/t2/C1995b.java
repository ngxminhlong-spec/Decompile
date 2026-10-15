package t2;

import android.app.Application;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.media.SoundPool;
import android.net.NetworkCapabilities;
import android.net.Uri;
import android.os.Handler;
import android.util.JsonReader;
import android.util.JsonWriter;
import android.util.Log;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.widget.TextView;
import com.duracodefactory.logiccircuitsimulatorpro.R;
import com.duracodefactory.logiccircuitsimulatorpro.view.BoardView;
import com.google.android.gms.internal.ads.AbstractC0598f9;
import com.google.android.gms.internal.ads.Aq;
import com.google.android.gms.internal.ads.Bs;
import com.google.android.gms.internal.ads.C0248Bc;
import com.google.android.gms.internal.ads.C0275Ga;
import com.google.android.gms.internal.ads.C0380a4;
import com.google.android.gms.internal.ads.C0512d8;
import com.google.android.gms.internal.ads.C0574em;
import com.google.android.gms.internal.ads.C0641g9;
import com.google.android.gms.internal.ads.C0727i9;
import com.google.android.gms.internal.ads.C0977o3;
import com.google.android.gms.internal.ads.C1016p;
import com.google.android.gms.internal.ads.C1059q;
import com.google.android.gms.internal.ads.C1093qr;
import com.google.android.gms.internal.ads.C1267uu;
import com.google.android.gms.internal.ads.C1350wr;
import com.google.android.gms.internal.ads.C1393xr;
import com.google.android.gms.internal.ads.C1423ye;
import com.google.android.gms.internal.ads.Eq;
import com.google.android.gms.internal.ads.M3;
import com.google.android.gms.internal.ads.Pu;
import com.google.android.gms.internal.ads.R3;
import com.google.android.gms.internal.ads.Y9;
import com.google.android.gms.internal.ads.Zf;
import e1.C1660a;
import e1.EnumC1662c;
import g1.InterfaceC1680a;
import h1.AbstractC1698a;
import j1.C1729a;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Scanner;
import java.util.concurrent.Executor;
import k.C1748e;
import l.J0;
import o2.AbstractC1895f;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p1.C1903A;
import p1.C1912J;
import p1.C1921g;
import p1.C1924j;
import p1.C1934u;
import p1.C1939z;
import p1.P;
import p1.Q;
import p1.Z;
import p1.b0;
import p1.e0;
import p1.i0;
import q1.AbstractC1954i;
import q1.AbstractC1955j;
import s1.C1973c;
import s1.InterfaceC1974d;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: t2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1995b implements I {

    /* renamed from: w, reason: collision with root package name */
    public static C1995b f14879w;

    /* renamed from: o, reason: collision with root package name */
    public Object f14880o;

    /* renamed from: p, reason: collision with root package name */
    public Object f14881p;

    /* renamed from: q, reason: collision with root package name */
    public Object f14882q;

    /* renamed from: r, reason: collision with root package name */
    public Object f14883r;

    /* renamed from: s, reason: collision with root package name */
    public Object f14884s;

    /* renamed from: t, reason: collision with root package name */
    public Object f14885t;

    /* renamed from: u, reason: collision with root package name */
    public Object f14886u;

    /* renamed from: v, reason: collision with root package name */
    public Object f14887v;

    public C1995b(Application application) {
        this.f14880o = this;
        G g4 = new G(application);
        this.f14881p = g4;
        E a4 = E.a(new k.o(13, g4));
        this.f14882q = a4;
        E a5 = E.a(r.f14934b);
        this.f14883r = a5;
        E a6 = E.a(new k.o(15, new k.o(12, this)));
        this.f14884s = a6;
        q2.e eVar = new q2.e(g4, new C1748e(13, g4), a4, 29);
        E a7 = E.a(new C2001h(3));
        this.f14885t = a7;
        C1996c c1996c = new C1996c(g4, a4);
        this.f14887v = c1996c;
        this.f14886u = E.a(new q2.e(a4, new J0(g4, a5, a4, a6, eVar, new q2.e(a7, c1996c, a4, 24), a7), a6, 27));
    }

    public /* synthetic */ C1995b(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        this.f14880o = obj;
        this.f14881p = obj2;
        this.f14882q = obj3;
        this.f14883r = obj4;
        this.f14884s = obj5;
        this.f14885t = obj6;
        this.f14886u = obj7;
        this.f14887v = obj8;
    }

    public static void c(C1995b c1995b) {
        InterfaceC1974d interfaceC1974d;
        BoardView boardView = (BoardView) c1995b.f14883r;
        if (boardView == null || (interfaceC1974d = boardView.f3798D) == null) {
            return;
        }
        interfaceC1974d.h();
    }

    public static C1995b s(Context context) {
        C1995b c1995b;
        synchronized (C1995b.class) {
            try {
                if (f14879w == null) {
                    Application application = (Application) context.getApplicationContext();
                    application.getClass();
                    f14879w = new C1995b(application);
                }
                c1995b = f14879w;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1995b;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:10:0x005c, code lost:
    
        if (r5 != null) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0060, code lost:
    
        r0.c.f14891b.edit().putInt("consent_status", 3).apply();
        r5.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0075, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0034, code lost:
    
        if (r5.equals("CONSENT_SIGNAL_PERSONALIZED_ADS") != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x003d, code lost:
    
        if (r5.equals("CONSENT_SIGNAL_SUFFICIENT") != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0046, code lost:
    
        if (r5.equals("personalized") != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x004f, code lost:
    
        if (r5.equals("CONSENT_SIGNAL_NON_PERSONALIZED_ADS") != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x002b, code lost:
    
        if (r5.equals("non_personalized") != false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0051, code lost:
    
        r0.c();
        r5 = (q1.C1947b) r0.f14903j.getAndSet(null);
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0021. Please report as an issue. */
    @Override // t2.I
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(java.lang.String r5, org.json.JSONObject r6) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t2.C1995b.a(java.lang.String, org.json.JSONObject):boolean");
    }

    @Override // t2.I
    public Executor b() {
        return new E.m((Handler) this.f14882q, 2);
    }

    public void d(W0.a aVar) {
        ((e1.d) this.f14880o).N(new L0.a(0, aVar));
        C1660a c1660a = (C1660a) this.f14886u;
        c1660a.clear();
        r(EnumC1662c.f12675o);
        c1660a.add(new C1729a(((e1.d) this.f14880o).h(aVar.f1942q)));
    }

    public boolean e() {
        C1660a c1660a = (C1660a) this.f14886u;
        if (!((BoardView) this.f14883r).f3803I && c1660a.size() == 1) {
            j1.c cVar = (j1.c) c1660a.get(0);
            if (cVar instanceof C1729a) {
                return ((C1729a) cVar).f13326o instanceof Q;
            }
        }
        return false;
    }

    public void f(Canvas canvas, RectF rectF, boolean z4) {
        e1.d dVar = (e1.d) this.f14880o;
        C1660a c1660a = (C1660a) this.f14886u;
        RectF rectF2 = dVar.f12695d0;
        ArrayList arrayList = dVar.f12681P;
        HashSet hashSet = dVar.f12698g0;
        int i4 = 0;
        if (dVar.f12685T) {
            hashSet.clear();
            int size = c1660a.size();
            int i5 = 0;
            while (i5 < size) {
                Object obj = c1660a.get(i5);
                i5++;
                j1.c cVar = (j1.c) obj;
                if (cVar instanceof C1729a) {
                    hashSet.add(Long.valueOf(((C1729a) cVar).f13326o.f13117A));
                }
            }
            int size2 = arrayList.size();
            int i6 = 0;
            while (i6 < size2) {
                Object obj2 = arrayList.get(i6);
                i6++;
                AbstractC1698a abstractC1698a = (AbstractC1698a) obj2;
                if (abstractC1698a instanceof Q) {
                    abstractC1698a.f(canvas, hashSet.contains(Long.valueOf(abstractC1698a.f13117A)), false);
                }
            }
            int size3 = arrayList.size();
            int i7 = 0;
            while (i7 < size3) {
                Object obj3 = arrayList.get(i7);
                i7++;
                AbstractC1698a abstractC1698a2 = (AbstractC1698a) obj3;
                if (!(abstractC1698a2 instanceof C1903A) && !(abstractC1698a2 instanceof Q)) {
                    abstractC1698a2.l(rectF2);
                    float f4 = rectF2.top;
                    rectF2.top = rectF2.bottom;
                    rectF2.bottom = f4;
                    if (RectF.intersects(rectF, rectF2)) {
                        abstractC1698a2.f(canvas, hashSet.contains(Long.valueOf(abstractC1698a2.f13117A)), z4);
                    }
                }
            }
            ArrayList arrayList2 = dVar.f12697f0;
            int size4 = arrayList2.size();
            int i8 = 0;
            while (i8 < size4) {
                Object obj4 = arrayList2.get(i8);
                i8++;
                m1.b bVar = (m1.b) obj4;
                if (bVar.f13986e) {
                    ArrayList arrayList3 = bVar.d;
                    int size5 = arrayList3.size();
                    int i9 = i4;
                    while (i9 < size5) {
                        Object obj5 = arrayList3.get(i9);
                        i9++;
                        m1.c cVar2 = (m1.c) obj5;
                        O0.a c = cVar2.d.c(dVar);
                        if (c instanceof C1912J) {
                            dVar.f12683R.g(canvas, (C1912J) c, bVar.f13985b + ": " + cVar2.f13989b);
                        }
                        i4 = 0;
                    }
                }
            }
        }
        for (Map.Entry entry : ((e1.d) this.f14880o).f12688W.entrySet()) {
            O0.a c2 = ((j1.b) entry.getValue()).c((e1.d) this.f14880o);
            if (c2 instanceof C1912J) {
                g(canvas, (C1912J) c2, (String) entry.getKey());
            }
        }
        if (((EnumC1662c) this.f14887v) == EnumC1662c.f12678r) {
            int size6 = c1660a.size();
            int i10 = 0;
            while (i10 < size6) {
                Object obj6 = c1660a.get(i10);
                i10++;
                C1912J c1912j = (C1912J) ((j1.b) ((j1.c) obj6)).c((e1.d) this.f14880o);
                ((BoardView) this.f14883r).getClass();
                AbstractC1954i.b(canvas, c1912j, true, true);
            }
        }
    }

    public void g(Canvas canvas, C1912J c1912j, String str) {
        ((BoardView) this.f14883r).getClass();
        Paint paint = AbstractC1954i.c;
        if (paint == null) {
            paint = new Paint();
            AbstractC1954i.c = paint;
            paint.setStrokeWidth(AbstractC1955j.c);
            paint.setColor(AbstractC1955j.f14691s);
            paint.setTextSize(AbstractC1955j.f14687o);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 1));
        }
        canvas.save();
        canvas.scale(2.0f, 2.0f, c1912j.f13122o, c1912j.f13123p);
        float f4 = c1912j.f13123p - (AbstractC1955j.f14676b / 2);
        paint.setTextAlign(Paint.Align.LEFT);
        canvas.drawText(str, c1912j.f13122o, f4, paint);
        canvas.drawCircle(c1912j.f13122o, c1912j.f13123p, AbstractC1955j.f14677e, paint);
        canvas.restore();
    }

    public void h(String str, boolean z4) {
        InterfaceC1974d interfaceC1974d;
        e1.g gVar = (e1.g) this.f14885t;
        HashSet hashSet = gVar.f12712g;
        if (z4) {
            hashSet.add(str);
        } else {
            hashSet.remove(str);
        }
        if (!z4 && hashSet.isEmpty()) {
            gVar.c();
        } else if (z4 && hashSet.size() == 1) {
            gVar.a();
        }
        if (!z4 || (interfaceC1974d = ((BoardView) this.f14883r).f3798D) == null) {
            return;
        }
        interfaceC1974d.g();
    }

    public ViewGroup i(Context context, int i4) {
        if (((ViewGroup) this.f14880o) == null) {
            this.f14880o = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.elem_popup_color, (ViewGroup) null);
        }
        if (i4 == 0) {
            i4 = context.getColor(R.color.accent_1);
        }
        ((ViewGroup) this.f14880o).findViewById(R.id.popup_color_circle).getBackground().setTint(i4);
        return (ViewGroup) this.f14880o;
    }

    public Pair j(int i4) {
        Drawable a4 = AbstractC1955j.a(((BoardView) this.f14883r).getContext(), i4, false);
        return new Pair(Integer.valueOf(a4.getIntrinsicWidth()), Integer.valueOf(a4.getIntrinsicHeight()));
    }

    public ViewGroup k(Context context, AbstractC1698a abstractC1698a) {
        if (abstractC1698a instanceof C1934u) {
            return i(context, ((C1934u) abstractC1698a).f14587R);
        }
        if (abstractC1698a instanceof Z) {
            return i(context, ((Z) abstractC1698a).f14492R);
        }
        if (abstractC1698a instanceof C1924j) {
            return i(context, ((C1924j) abstractC1698a).f14554T);
        }
        if (abstractC1698a instanceof P) {
            if (((ViewGroup) this.f14881p) == null) {
                this.f14881p = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.elem_popup_pal, (ViewGroup) null);
            }
            return (ViewGroup) this.f14881p;
        }
        if (abstractC1698a instanceof e0) {
            if (((ViewGroup) this.f14882q) == null) {
                this.f14882q = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.elem_popup_text, (ViewGroup) null);
            }
            return (ViewGroup) this.f14882q;
        }
        if (abstractC1698a instanceof i0) {
            String q4 = AbstractC1895f.q(((i0) abstractC1698a).f14549e0 * 1000);
            if (((ViewGroup) this.f14883r) == null) {
                this.f14883r = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.elem_popup_timer_delayer, (ViewGroup) null);
            }
            ((TextView) ((ViewGroup) this.f14883r).findViewById(R.id.elem_popup_delayer_text)).setText(q4);
            return (ViewGroup) this.f14883r;
        }
        if (abstractC1698a instanceof e1.d) {
            if (((ViewGroup) this.f14884s) == null) {
                this.f14884s = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.elem_popup_circuit, (ViewGroup) null);
            }
            return (ViewGroup) this.f14884s;
        }
        if (abstractC1698a instanceof C1939z) {
            String O4 = C1939z.O(((C1939z) abstractC1698a).f14600R);
            if (((ViewGroup) this.f14885t) == null) {
                this.f14885t = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.elem_popup_generator, (ViewGroup) null);
            }
            ((TextView) ((ViewGroup) this.f14885t).findViewById(R.id.elem_popup_generator_text)).setText(O4);
            return (ViewGroup) this.f14885t;
        }
        if (abstractC1698a instanceof C1921g) {
            C1921g c1921g = (C1921g) abstractC1698a;
            if (((ViewGroup) this.f14886u) == null) {
                this.f14886u = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.elem_popup_button, (ViewGroup) null);
            }
            ((ViewGroup) this.f14886u).findViewById(R.id.img).setBackgroundResource(c1921g.f14530Q ? R.drawable.ic_button_state_on : R.drawable.ic_button_state_off);
            return (ViewGroup) this.f14886u;
        }
        if (!(abstractC1698a instanceof b0)) {
            return null;
        }
        b0 b0Var = (b0) abstractC1698a;
        if (((ViewGroup) this.f14887v) == null) {
            this.f14887v = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.elem_popup_switch, (ViewGroup) null);
        }
        ((ViewGroup) this.f14887v).findViewById(R.id.img).setBackgroundResource(b0Var.f14503Q ? R.drawable.ic_switch_state_icon_on : R.drawable.ic_switch_state_icon_off);
        return (ViewGroup) this.f14887v;
    }

    public void l(float f4, float f5) {
        C1660a c1660a = (C1660a) this.f14886u;
        int size = c1660a.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = c1660a.get(i4);
            i4++;
            j1.c cVar = (j1.c) obj;
            if (cVar instanceof C1729a) {
                AbstractC1698a abstractC1698a = ((C1729a) cVar).f13326o;
                if (!(abstractC1698a instanceof Q)) {
                    abstractC1698a.y(abstractC1698a.f13122o + f4, abstractC1698a.f13123p + f5);
                } else if (e()) {
                    abstractC1698a.y(abstractC1698a.f13122o + f4, abstractC1698a.f13123p + f5);
                }
            }
        }
    }

    public boolean m(int i4, int i5, boolean z4) {
        boolean z5;
        C1660a c1660a = (C1660a) this.f14886u;
        j1.c Q3 = ((e1.d) this.f14880o).Q(i4, i5);
        EnumC1662c enumC1662c = EnumC1662c.f12678r;
        int i6 = 0;
        if (Q3 != null) {
            EnumC1662c enumC1662c2 = (EnumC1662c) this.f14887v;
            if (enumC1662c2 != EnumC1662c.f12679s) {
                EnumC1662c enumC1662c3 = EnumC1662c.f12675o;
                if (enumC1662c2 == enumC1662c3) {
                    if (Q3 instanceof C1729a) {
                        c1660a.clear();
                        c1660a.add(Q3);
                        return true;
                    }
                    q(enumC1662c);
                } else if (enumC1662c2 == enumC1662c && (Q3 instanceof C1729a) && !(((C1729a) Q3).f13326o instanceof C1912J)) {
                    q(enumC1662c3);
                    c1660a.clear();
                    c1660a.add(Q3);
                    return true;
                }
                EnumC1662c enumC1662c4 = (EnumC1662c) this.f14887v;
                if (enumC1662c4 == EnumC1662c.f12676p) {
                    if (!z4) {
                        if (Q3 instanceof j1.b) {
                            c1660a.clear();
                            c1660a.add(Q3);
                            return true;
                        }
                        if ((Q3 instanceof C1729a) && (((C1729a) Q3).f13326o instanceof C1912J)) {
                            c1660a.clear();
                            c1660a.add(new j1.b(0, Q3.a(), ""));
                            return true;
                        }
                    }
                } else if (enumC1662c4 == EnumC1662c.f12677q) {
                    if (Q3 instanceof C1729a) {
                        int size = c1660a.size();
                        int i7 = 0;
                        while (i7 < size) {
                            Object obj = c1660a.get(i7);
                            i7++;
                            if (((j1.c) obj).a() == Q3.a()) {
                                break;
                            }
                            i6++;
                        }
                        if (i6 < c1660a.size()) {
                            c1660a.remove(i6);
                            return true;
                        }
                        c1660a.add(Q3);
                        return true;
                    }
                } else if (enumC1662c4 == enumC1662c && (((z5 = Q3 instanceof j1.b)) || ((Q3 instanceof C1729a) && (((C1729a) Q3).f13326o instanceof C1912J)))) {
                    if (!c1660a.isEmpty() && z5) {
                        j1.b bVar = (j1.b) c1660a.get(0);
                        j1.b bVar2 = (j1.b) Q3;
                        if (bVar.f13327o == bVar2.f13327o && Objects.equals(bVar.f13328p, bVar2.f13328p)) {
                            return false;
                        }
                    }
                    if (Q3 instanceof C1729a) {
                        long a4 = Q3.a();
                        j1.b bVar3 = new j1.b(0, a4, "");
                        if (!c1660a.isEmpty()) {
                            j1.b bVar4 = (j1.b) c1660a.get(0);
                            if (bVar4.f13327o == a4 && Objects.equals(bVar4.f13328p, "")) {
                                return false;
                            }
                        }
                        c1660a.add(bVar3);
                    } else {
                        c1660a.add(Q3);
                    }
                    if (c1660a.size() == 2) {
                        j1.b bVar5 = (j1.b) c1660a.get(0);
                        j1.b bVar6 = (j1.b) c1660a.get(1);
                        q(enumC1662c3);
                        O0.a c = bVar5.c((e1.d) this.f14880o);
                        O0.a c2 = bVar6.c((e1.d) this.f14880o);
                        if (c.g(c2) || c2.g(c)) {
                            c1660a.clear();
                        } else {
                            e1.d dVar = (e1.d) this.f14880o;
                            long j4 = dVar.f12692a0;
                            dVar.f12692a0 = 1 + j4;
                            V0.a aVar = new V0.a(j4, bVar5, bVar6, new float[0]);
                            dVar.N(new L0.a(0, aVar));
                            e1.g gVar = (e1.g) this.f14885t;
                            if (gVar.f12709b != null && gVar.f12717l) {
                                gVar.d("path", true);
                                gVar.f12715j.postDelayed(gVar.f12718m, 24L);
                            }
                            c1660a.clear();
                            c1660a.add(new C1729a(((e1.d) this.f14880o).h(aVar.f1942q)));
                        }
                        InterfaceC1974d interfaceC1974d = ((BoardView) this.f14883r).f3798D;
                        if (interfaceC1974d != null) {
                            interfaceC1974d.n();
                        }
                    }
                    return true;
                }
            } else if (Q3 instanceof C1729a) {
                return ((C1729a) Q3).f13326o.w();
            }
        } else if (!z4 && ((EnumC1662c) this.f14887v) == enumC1662c) {
            c1660a.clear();
            return false;
        }
        return false;
    }

    public void n(InterfaceC1680a interfaceC1680a) {
        ((f1.b) this.f14881p).a(interfaceC1680a);
    }

    public void o(int i4, boolean z4) {
        B0.u uVar = ((e1.g) this.f14885t).d;
        int[] iArr = (int[]) uVar.f119r;
        int[] iArr2 = (int[]) uVar.f117p;
        int i5 = iArr2[i4] + (z4 ? 1 : -1);
        iArr2[i4] = i5;
        if (i5 < 0) {
            iArr2[i4] = 0;
        }
        if (uVar.f116o) {
            int i6 = iArr2[i4];
            if (i6 == 0) {
                ((SoundPool) uVar.f120s).stop(iArr[i4]);
            } else if (z4 && i6 == 1) {
                iArr[i4] = ((SoundPool) uVar.f120s).play(((int[]) uVar.f118q)[i4], 0.8f, 0.8f, 1, -1, 1.0f);
            }
            int i7 = 0;
            for (int i8 : iArr2) {
                i7 += i8;
            }
            if (i7 == 0) {
                ((C1973c) uVar.f121t).a(false);
            } else if (z4 && i7 == 1) {
                ((C1973c) uVar.f121t).a(true);
            }
        }
    }

    public void p(e1.e eVar) {
        e1.f fVar = (e1.f) this.f14882q;
        ArrayList arrayList = fVar.f12701e;
        arrayList.add(eVar);
        if (arrayList.isEmpty()) {
            fVar.c = false;
            fVar.f12699a = 0L;
            fVar.f12703g = 0L;
            fVar.f12704h = 1.0f;
        } else {
            fVar.c = true;
            fVar.a();
        }
        BoardView boardView = (BoardView) this.f14883r;
        f1.b bVar = boardView.f3807M;
        float f4 = boardView.f3806L.f12704h;
        bVar.getClass();
        InterfaceC1974d interfaceC1974d = boardView.f3798D;
        if (interfaceC1974d != null) {
            interfaceC1974d.o();
        }
    }

    public void q(EnumC1662c enumC1662c) {
        BoardView boardView = (BoardView) this.f14883r;
        if (enumC1662c == EnumC1662c.f12678r && boardView.f3803I) {
            return;
        }
        boardView.setSelectionMode(enumC1662c);
    }

    public void r(EnumC1662c enumC1662c) {
        EnumC1662c enumC1662c2 = (EnumC1662c) this.f14887v;
        if (enumC1662c2 != enumC1662c) {
            if (enumC1662c2 != EnumC1662c.f12675o || enumC1662c != EnumC1662c.f12677q) {
                ((C1660a) this.f14886u).clear();
            }
            this.f14887v = enumC1662c;
        }
    }

    public HashMap t() {
        long j4;
        HashMap y = y();
        A2.r rVar = (A2.r) ((C0275Ga) this.f14881p).f5186s;
        C0977o3 c0977o3 = C1350wr.f11215a;
        if (rVar.j()) {
            c0977o3 = (C0977o3) rVar.g();
        }
        y.put("gai", Boolean.valueOf(((C1093qr) this.f14880o).f10418b));
        y.put("did", c0977o3.s0());
        y.put("dst", Integer.valueOf(c0977o3.h0() - 1));
        y.put("doo", Boolean.valueOf(c0977o3.e0()));
        M3 m32 = (M3) this.f14884s;
        if (m32 != null) {
            synchronized (M3.class) {
                try {
                    NetworkCapabilities networkCapabilities = (NetworkCapabilities) m32.f6208p;
                    if (networkCapabilities != null) {
                        if (networkCapabilities.hasTransport(4)) {
                            j4 = 2;
                        } else if (((NetworkCapabilities) m32.f6208p).hasTransport(1)) {
                            j4 = 1;
                        } else if (((NetworkCapabilities) m32.f6208p).hasTransport(0)) {
                            j4 = 0;
                        }
                    }
                    j4 = -1;
                } finally {
                }
            }
            y.put("nt", Long.valueOf(j4));
        }
        C0380a4 c0380a4 = (C0380a4) this.f14885t;
        if (c0380a4 != null) {
            y.put("vs", Long.valueOf(c0380a4.d ? c0380a4.f8075b - c0380a4.f8074a : -1L));
            C0380a4 c0380a42 = (C0380a4) this.f14885t;
            long j5 = c0380a42.c;
            c0380a42.c = -1L;
            y.put("vf", Long.valueOf(j5));
        }
        return y;
    }

    public C1267uu u(String str, String str2) {
        Context context = (Context) this.f14881p;
        Aq f4 = Zf.f(context, 11);
        f4.f();
        C0641g9 B4 = N1.n.f1204A.f1218p.B(context, (C0248Bc) this.f14882q, ((C1423ye) this.f14880o).d());
        C1016p c1016p = AbstractC0598f9.f8690b;
        C0727i9 a4 = B4.a("google.afma.response.normalize", c1016p, c1016p);
        Pu h02 = Bs.h0("");
        N1.c cVar = new N1.c(7, str, str2);
        Executor executor = (Executor) this.f14884s;
        C1267uu n02 = Bs.n0(Bs.n0(Bs.n0(h02, cVar, executor), new C0512d8(13, a4), executor), new C0512d8(14, this), executor);
        Zf.Z(n02, (Eq) this.f14886u, f4, false);
        return n02;
    }

    public C0574em v(p pVar) {
        try {
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("https://fundingchoicesmessages.google.com/a/consent").openConnection();
            httpURLConnection.setRequestProperty("User-Agent", WebSettings.getDefaultUserAgent((Application) this.f14880o));
            httpURLConnection.setConnectTimeout(10000);
            httpURLConnection.setReadTimeout(30000);
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setRequestProperty("Content-Type", "application/json");
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(httpURLConnection.getOutputStream(), "UTF-8");
            try {
                JsonWriter jsonWriter = new JsonWriter(outputStreamWriter);
                try {
                    jsonWriter.beginObject();
                    String str = pVar.f14923a;
                    if (str != null) {
                        jsonWriter.name("admob_app_id");
                        jsonWriter.value(str);
                    }
                    String str2 = pVar.f14924b;
                    if (str2 != null) {
                        jsonWriter.name("adid");
                        jsonWriter.value(str2);
                    }
                    androidx.activity.result.c cVar = pVar.c;
                    if (cVar != null) {
                        jsonWriter.name("device_info");
                        jsonWriter.beginObject();
                        int i4 = cVar.f2431a;
                        if (i4 != 1) {
                            jsonWriter.name("os_type");
                            int i5 = i4 - 1;
                            if (i5 == 0) {
                                jsonWriter.value("UNKNOWN");
                            } else if (i5 == 1) {
                                jsonWriter.value("ANDROID");
                            }
                        }
                        String str3 = (String) cVar.f2432b;
                        if (str3 != null) {
                            jsonWriter.name("model");
                            jsonWriter.value(str3);
                        }
                        Integer num = (Integer) cVar.c;
                        jsonWriter.name("android_api_level");
                        jsonWriter.value(num);
                        jsonWriter.endObject();
                    }
                    String str4 = pVar.d;
                    if (str4 != null) {
                        jsonWriter.name("language_code");
                        jsonWriter.value(str4);
                    }
                    Boolean bool = pVar.f14925e;
                    if (bool != null) {
                        jsonWriter.name("tag_for_under_age_of_consent");
                        jsonWriter.value(bool.booleanValue());
                    }
                    Map map = pVar.f14926f;
                    if (!map.isEmpty()) {
                        jsonWriter.name("stored_infos_map");
                        jsonWriter.beginObject();
                        for (Map.Entry entry : map.entrySet()) {
                            jsonWriter.name((String) entry.getKey());
                            jsonWriter.value((String) entry.getValue());
                        }
                        jsonWriter.endObject();
                    }
                    u0.g gVar = pVar.f14927g;
                    if (gVar != null) {
                        jsonWriter.name("screen_info");
                        jsonWriter.beginObject();
                        Integer num2 = (Integer) gVar.f14983p;
                        if (num2 != null) {
                            jsonWriter.name("width");
                            jsonWriter.value(num2);
                        }
                        Integer num3 = (Integer) gVar.f14984q;
                        if (num3 != null) {
                            jsonWriter.name("height");
                            jsonWriter.value(num3);
                        }
                        Double d = (Double) gVar.f14985r;
                        if (d != null) {
                            jsonWriter.name("density");
                            jsonWriter.value(d);
                        }
                        List<o> list = (List) gVar.f14986s;
                        if (!list.isEmpty()) {
                            jsonWriter.name("screen_insets");
                            jsonWriter.beginArray();
                            for (o oVar : list) {
                                jsonWriter.beginObject();
                                Integer num4 = oVar.f14921a;
                                if (num4 != null) {
                                    jsonWriter.name("top");
                                    jsonWriter.value(num4);
                                }
                                Integer num5 = oVar.f14922b;
                                if (num5 != null) {
                                    jsonWriter.name("left");
                                    jsonWriter.value(num5);
                                }
                                Integer num6 = oVar.c;
                                if (num6 != null) {
                                    jsonWriter.name("right");
                                    jsonWriter.value(num6);
                                }
                                Integer num7 = oVar.d;
                                if (num7 != null) {
                                    jsonWriter.name("bottom");
                                    jsonWriter.value(num7);
                                }
                                jsonWriter.endObject();
                            }
                            jsonWriter.endArray();
                        }
                        jsonWriter.endObject();
                    }
                    q2.e eVar = pVar.f14928h;
                    if (eVar != null) {
                        jsonWriter.name("app_info");
                        jsonWriter.beginObject();
                        String str5 = (String) eVar.f14709p;
                        if (str5 != null) {
                            jsonWriter.name("package_name");
                            jsonWriter.value(str5);
                        }
                        String str6 = (String) eVar.f14710q;
                        if (str6 != null) {
                            jsonWriter.name("publisher_display_name");
                            jsonWriter.value(str6);
                        }
                        String str7 = (String) eVar.f14711r;
                        if (str7 != null) {
                            jsonWriter.name("version");
                            jsonWriter.value(str7);
                        }
                        jsonWriter.endObject();
                    }
                    if (pVar.f14929i != null) {
                        jsonWriter.name("sdk_info");
                        jsonWriter.beginObject();
                        jsonWriter.name("version");
                        jsonWriter.value("2.1.0");
                        jsonWriter.endObject();
                    }
                    List list2 = pVar.f14930j;
                    if (!list2.isEmpty()) {
                        jsonWriter.name("debug_params");
                        jsonWriter.beginArray();
                        Iterator it = list2.iterator();
                        while (it.hasNext()) {
                            int ordinal = ((EnumC2007n) it.next()).ordinal();
                            if (ordinal == 0) {
                                jsonWriter.value("DEBUG_PARAM_UNKNOWN");
                            } else if (ordinal == 1) {
                                jsonWriter.value("ALWAYS_SHOW");
                            } else if (ordinal == 2) {
                                jsonWriter.value("GEO_OVERRIDE_EEA");
                            } else if (ordinal == 3) {
                                jsonWriter.value("GEO_OVERRIDE_NON_EEA");
                            } else if (ordinal == 4) {
                                jsonWriter.value("PREVIEWING_DEBUG_MESSAGES");
                            }
                        }
                        jsonWriter.endArray();
                    }
                    jsonWriter.endObject();
                    jsonWriter.close();
                    outputStreamWriter.close();
                    int responseCode = httpURLConnection.getResponseCode();
                    if (responseCode != 200) {
                        throw new IOException("Http error code - " + responseCode + ".\n" + new Scanner(httpURLConnection.getErrorStream()).useDelimiter("\\A").next());
                    }
                    String headerField = httpURLConnection.getHeaderField("x-ump-using-header");
                    if (headerField != null) {
                        C0574em c = C0574em.c(new JsonReader(new StringReader(headerField)));
                        c.f8636a = new Scanner(httpURLConnection.getInputStream()).useDelimiter("\\A").next();
                        return c;
                    }
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), "UTF-8"));
                    try {
                        bufferedReader.readLine();
                        JsonReader jsonReader = new JsonReader(bufferedReader);
                        try {
                            C0574em c2 = C0574em.c(jsonReader);
                            jsonReader.close();
                            bufferedReader.close();
                            return c2;
                        } finally {
                        }
                    } catch (Throwable th) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th2) {
                            Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                        }
                        throw th;
                    }
                } finally {
                }
            } catch (Throwable th3) {
                try {
                    outputStreamWriter.close();
                } catch (Throwable th4) {
                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th3, th4);
                }
                throw th3;
            }
        } catch (SocketTimeoutException e4) {
            throw new K(4, "The server timed out.", e4);
        } catch (IOException e5) {
            throw new K(2, "Error making request.", e5);
        }
    }

    public String w(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            JSONArray jSONArray = jSONObject.getJSONArray("ad_types");
            if (jSONArray != null && "unknown".equals(jSONArray.getString(0))) {
                jSONObject.put("ad_types", new JSONArray().put((String) this.f14885t));
            }
            return jSONObject.toString();
        } catch (JSONException e4) {
            Y9.s("Failed to update the ad types for rendering. ".concat(e4.toString()));
            return str;
        }
    }

    public void x(String str) {
        Log.d("UserMessagingPlatform", "Receive consent action: ".concat(String.valueOf(str)));
        Uri parse = Uri.parse(str);
        ((J) this.f14884s).f14863a.execute(new E.n(parse.getQueryParameter("action"), parse.getQueryParameter("args"), new I[]{this, (q2.e) this.f14885t}, 9));
    }

    public HashMap y() {
        HashMap hashMap = new HashMap();
        C1093qr c1093qr = (C1093qr) this.f14880o;
        A2.r rVar = (A2.r) ((C0275Ga) this.f14881p).f5187t;
        C0977o3 c0977o3 = C1393xr.f11306a;
        if (rVar.j()) {
            c0977o3 = (C0977o3) rVar.g();
        }
        hashMap.put("v", c1093qr.f10417a);
        hashMap.put("gms", Boolean.valueOf(c1093qr.c));
        hashMap.put("int", c0977o3.t0());
        hashMap.put("up", Boolean.valueOf(((R3) this.f14883r).f6784a));
        hashMap.put("t", new Throwable());
        C1059q c1059q = (C1059q) this.f14886u;
        if (c1059q != null) {
            hashMap.put("tcq", Long.valueOf(c1059q.f10062a));
            hashMap.put("tpq", Long.valueOf(c1059q.f10063b));
            hashMap.put("tcv", Long.valueOf(c1059q.c));
            hashMap.put("tpv", Long.valueOf(c1059q.d));
            hashMap.put("tchv", Long.valueOf(c1059q.f10064e));
            hashMap.put("tphv", Long.valueOf(c1059q.f10065f));
            hashMap.put("tcc", Long.valueOf(c1059q.f10066g));
            hashMap.put("tpc", Long.valueOf(c1059q.f10067h));
        }
        return hashMap;
    }
}
