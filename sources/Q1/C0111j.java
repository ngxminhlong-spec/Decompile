package Q1;

import O1.D0;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PointF;
import android.net.Uri;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.view.WindowManager;
import com.google.android.gms.internal.ads.AbstractC0266Ec;
import com.google.android.gms.internal.ads.AbstractC1066q6;
import com.google.android.gms.internal.ads.C0260Dc;
import com.google.android.gms.internal.ads.Lk;
import com.google.android.gms.internal.ads.Ok;
import com.google.android.gms.internal.ads.Ur;
import com.google.android.gms.internal.ads.Y9;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: Q1.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0111j {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1703a;

    /* renamed from: b, reason: collision with root package name */
    public final Ok f1704b;
    public String c;
    public String d;

    /* renamed from: e, reason: collision with root package name */
    public String f1705e;

    /* renamed from: f, reason: collision with root package name */
    public String f1706f;

    /* renamed from: h, reason: collision with root package name */
    public final int f1708h;

    /* renamed from: i, reason: collision with root package name */
    public PointF f1709i;

    /* renamed from: j, reason: collision with root package name */
    public PointF f1710j;

    /* renamed from: k, reason: collision with root package name */
    public final Ur f1711k;

    /* renamed from: g, reason: collision with root package name */
    public int f1707g = 0;

    /* renamed from: l, reason: collision with root package name */
    public final RunnableC0103b f1712l = new RunnableC0103b(this, 2);

    public C0111j(Context context) {
        this.f1703a = context;
        this.f1708h = ViewConfiguration.get(context).getScaledTouchSlop();
        N1.n nVar = N1.n.f1204A;
        nVar.f1220r.b();
        this.f1711k = (Ur) nVar.f1220r.f857r;
        this.f1704b = (Ok) nVar.f1215m.f1272g;
    }

    public static final int e(ArrayList arrayList, String str, boolean z4) {
        if (!z4) {
            return -1;
        }
        arrayList.add(str);
        return arrayList.size() - 1;
    }

    public final void a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        int historySize = motionEvent.getHistorySize();
        int pointerCount = motionEvent.getPointerCount();
        if (actionMasked == 0) {
            this.f1707g = 0;
            this.f1709i = new PointF(motionEvent.getX(0), motionEvent.getY(0));
            return;
        }
        int i4 = this.f1707g;
        if (i4 == -1) {
            return;
        }
        RunnableC0103b runnableC0103b = this.f1712l;
        Ur ur = this.f1711k;
        if (i4 == 0) {
            if (actionMasked == 5) {
                this.f1707g = 5;
                this.f1710j = new PointF(motionEvent.getX(1), motionEvent.getY(1));
                ur.postDelayed(runnableC0103b, ((Long) O1.r.d.c.a(AbstractC1066q6.f10192Y3)).longValue());
                return;
            }
            return;
        }
        if (i4 == 5) {
            if (pointerCount == 2) {
                if (actionMasked != 2) {
                    return;
                }
                boolean z4 = false;
                for (int i5 = 0; i5 < historySize; i5++) {
                    z4 |= !d(motionEvent.getHistoricalX(0, i5), motionEvent.getHistoricalY(0, i5), motionEvent.getHistoricalX(1, i5), motionEvent.getHistoricalY(1, i5));
                }
                if (d(motionEvent.getX(), motionEvent.getY(), motionEvent.getX(1), motionEvent.getY(1)) && !z4) {
                    return;
                }
            }
            this.f1707g = -1;
            ur.removeCallbacks(runnableC0103b);
        }
    }

    public final void b() {
        String str;
        Context context = this.f1703a;
        try {
            if (!(context instanceof Activity)) {
                Y9.r("Can not create dialog without Activity Context");
                return;
            }
            N1.n nVar = N1.n.f1204A;
            D0 d02 = nVar.f1215m;
            synchronized (d02.f1268a) {
                str = (String) d02.f1270e;
            }
            String str2 = "Creative preview (enabled)";
            if (true == TextUtils.isEmpty(str)) {
                str2 = "Creative preview";
            }
            String str3 = true != nVar.f1215m.k() ? "Troubleshooting" : "Troubleshooting (enabled)";
            ArrayList arrayList = new ArrayList();
            final int e4 = e(arrayList, "Ad information", true);
            final int e5 = e(arrayList, str2, true);
            final int e6 = e(arrayList, str3, true);
            boolean booleanValue = ((Boolean) O1.r.d.c.a(AbstractC1066q6.e8)).booleanValue();
            final int e7 = e(arrayList, "Open ad inspector", booleanValue);
            final int e8 = e(arrayList, "Ad inspector settings", booleanValue);
            AlertDialog.Builder h4 = N.h(context);
            h4.setTitle("Select a debug mode").setItems((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: Q1.f
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i4) {
                    final C0111j c0111j = C0111j.this;
                    Ok ok = c0111j.f1704b;
                    Context context2 = c0111j.f1703a;
                    if (i4 != e4) {
                        if (i4 == e5) {
                            Y9.m("Debug mode [Creative Preview] selected.");
                            AbstractC0266Ec.f4897a.execute(new RunnableC0103b(c0111j, 3));
                            return;
                        }
                        if (i4 == e6) {
                            Y9.m("Debug mode [Troubleshooting] selected.");
                            AbstractC0266Ec.f4897a.execute(new RunnableC0103b(c0111j, 1));
                            return;
                        }
                        if (i4 == e7) {
                            final C0260Dc c0260Dc = AbstractC0266Ec.f4899e;
                            C0260Dc c0260Dc2 = AbstractC0266Ec.f4897a;
                            if (ok.f()) {
                                c0260Dc.execute(new RunnableC0103b(c0111j, 6));
                                return;
                            } else {
                                final int i5 = 0;
                                c0260Dc2.execute(new Runnable() { // from class: Q1.c
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i5) {
                                            case 0:
                                                N1.n nVar2 = N1.n.f1204A;
                                                D0 d03 = nVar2.f1215m;
                                                C0111j c0111j2 = c0111j;
                                                Context context3 = c0111j2.f1703a;
                                                if (!d03.i(context3, c0111j2.d, c0111j2.f1705e)) {
                                                    nVar2.f1215m.c(context3, c0111j2.d, c0111j2.f1705e);
                                                    return;
                                                } else {
                                                    c0260Dc.execute(new RunnableC0103b(c0111j2, 4));
                                                    return;
                                                }
                                            default:
                                                N1.n nVar3 = N1.n.f1204A;
                                                D0 d04 = nVar3.f1215m;
                                                C0111j c0111j3 = c0111j;
                                                Context context4 = c0111j3.f1703a;
                                                if (!d04.i(context4, c0111j3.d, c0111j3.f1705e)) {
                                                    nVar3.f1215m.c(context4, c0111j3.d, c0111j3.f1705e);
                                                    return;
                                                } else {
                                                    c0260Dc.execute(new RunnableC0103b(c0111j3, 5));
                                                    return;
                                                }
                                        }
                                    }
                                });
                                return;
                            }
                        }
                        if (i4 == e8) {
                            final C0260Dc c0260Dc3 = AbstractC0266Ec.f4899e;
                            C0260Dc c0260Dc4 = AbstractC0266Ec.f4897a;
                            if (ok.f()) {
                                c0260Dc3.execute(new RunnableC0103b(c0111j, 0));
                                return;
                            } else {
                                final int i6 = 1;
                                c0260Dc4.execute(new Runnable() { // from class: Q1.c
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        switch (i6) {
                                            case 0:
                                                N1.n nVar2 = N1.n.f1204A;
                                                D0 d03 = nVar2.f1215m;
                                                C0111j c0111j2 = c0111j;
                                                Context context3 = c0111j2.f1703a;
                                                if (!d03.i(context3, c0111j2.d, c0111j2.f1705e)) {
                                                    nVar2.f1215m.c(context3, c0111j2.d, c0111j2.f1705e);
                                                    return;
                                                } else {
                                                    c0260Dc3.execute(new RunnableC0103b(c0111j2, 4));
                                                    return;
                                                }
                                            default:
                                                N1.n nVar3 = N1.n.f1204A;
                                                D0 d04 = nVar3.f1215m;
                                                C0111j c0111j3 = c0111j;
                                                Context context4 = c0111j3.f1703a;
                                                if (!d04.i(context4, c0111j3.d, c0111j3.f1705e)) {
                                                    nVar3.f1215m.c(context4, c0111j3.d, c0111j3.f1705e);
                                                    return;
                                                } else {
                                                    c0260Dc3.execute(new RunnableC0103b(c0111j3, 5));
                                                    return;
                                                }
                                        }
                                    }
                                });
                                return;
                            }
                        }
                        return;
                    }
                    if (!(context2 instanceof Activity)) {
                        Y9.r("Can not create dialog without Activity Context");
                        return;
                    }
                    String str4 = c0111j.c;
                    String str5 = "No debug information";
                    if (!TextUtils.isEmpty(str4)) {
                        Uri build = new Uri.Builder().encodedQuery(str4.replaceAll("\\+", "%20")).build();
                        StringBuilder sb = new StringBuilder();
                        N n4 = N1.n.f1204A.c;
                        HashMap k3 = N.k(build);
                        for (String str6 : k3.keySet()) {
                            sb.append(str6);
                            sb.append(" = ");
                            sb.append((String) k3.get(str6));
                            sb.append("\n\n");
                        }
                        String trim = sb.toString().trim();
                        if (!TextUtils.isEmpty(trim)) {
                            str5 = trim;
                        }
                    }
                    N n5 = N1.n.f1204A.c;
                    AlertDialog.Builder h5 = N.h(context2);
                    h5.setMessage(str5);
                    h5.setTitle("Ad Information");
                    h5.setPositiveButton("Share", new DialogInterfaceOnClickListenerC0105d(0, c0111j, str5));
                    h5.setNegativeButton("Close", DialogInterfaceOnClickListenerC0106e.f1688o);
                    h5.create().show();
                }
            });
            h4.create().show();
        } catch (WindowManager.BadTokenException e9) {
            I.x("", e9);
        }
    }

    public final void c(Context context) {
        ArrayList arrayList = new ArrayList();
        int e4 = e(arrayList, "None", true);
        final int e5 = e(arrayList, "Shake", true);
        final int e6 = e(arrayList, "Flick", true);
        int ordinal = this.f1704b.f6506o.ordinal();
        final int i4 = ordinal != 1 ? ordinal != 2 ? e4 : e6 : e5;
        N n4 = N1.n.f1204A.c;
        AlertDialog.Builder h4 = N.h(context);
        final AtomicInteger atomicInteger = new AtomicInteger(i4);
        h4.setTitle("Setup gesture");
        h4.setSingleChoiceItems((CharSequence[]) arrayList.toArray(new String[0]), i4, new DialogInterfaceOnClickListenerC0108g(0, atomicInteger));
        h4.setNegativeButton("Dismiss", new DialogInterfaceOnClickListenerC0108g(1, this));
        h4.setPositiveButton("Save", new DialogInterface.OnClickListener() { // from class: Q1.h
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i5) {
                C0111j c0111j = C0111j.this;
                Ok ok = c0111j.f1704b;
                AtomicInteger atomicInteger2 = atomicInteger;
                if (atomicInteger2.get() != i4) {
                    if (atomicInteger2.get() == e5) {
                        ok.k(Lk.f6154p, true);
                    } else if (atomicInteger2.get() == e6) {
                        ok.k(Lk.f6155q, true);
                    } else {
                        ok.k(Lk.f6153o, true);
                    }
                }
                c0111j.b();
            }
        });
        h4.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: Q1.i
            @Override // android.content.DialogInterface.OnCancelListener
            public final void onCancel(DialogInterface dialogInterface) {
                C0111j.this.b();
            }
        });
        h4.create().show();
    }

    public final boolean d(float f4, float f5, float f6, float f7) {
        float abs = Math.abs(this.f1709i.x - f4);
        int i4 = this.f1708h;
        return abs < ((float) i4) && Math.abs(this.f1709i.y - f5) < ((float) i4) && Math.abs(this.f1710j.x - f6) < ((float) i4) && Math.abs(this.f1710j.y - f7) < ((float) i4);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(100);
        sb.append("{Dialog: ");
        sb.append(this.c);
        sb.append(",DebugSignal: ");
        sb.append(this.f1706f);
        sb.append(",AFMA Version: ");
        sb.append(this.f1705e);
        sb.append(",Ad Unit ID: ");
        return n0.a.j(sb, this.d, "}");
    }
}
