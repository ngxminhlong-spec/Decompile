package com.google.android.gms.internal.ads;

import H.C0034i;
import android.graphics.Rect;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.TextView;
import java.util.LinkedList;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class I4 extends Thread {

    /* renamed from: A, reason: collision with root package name */
    public final String f5532A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f5533B;

    /* renamed from: C, reason: collision with root package name */
    public final boolean f5534C;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f5535D;

    /* renamed from: o, reason: collision with root package name */
    public boolean f5536o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f5537p;

    /* renamed from: q, reason: collision with root package name */
    public final Object f5538q;

    /* renamed from: r, reason: collision with root package name */
    public final J2 f5539r;

    /* renamed from: s, reason: collision with root package name */
    public final int f5540s;

    /* renamed from: t, reason: collision with root package name */
    public final int f5541t;

    /* renamed from: u, reason: collision with root package name */
    public final int f5542u;

    /* renamed from: v, reason: collision with root package name */
    public final int f5543v;

    /* renamed from: w, reason: collision with root package name */
    public final int f5544w;

    /* renamed from: x, reason: collision with root package name */
    public final int f5545x;
    public final int y;

    /* renamed from: z, reason: collision with root package name */
    public final int f5546z;

    public I4() {
        J2 j22 = new J2(3, (byte) 0);
        this.f5536o = false;
        this.f5537p = false;
        this.f5539r = j22;
        this.f5538q = new Object();
        this.f5541t = ((Long) F6.d.r()).intValue();
        this.f5542u = ((Long) F6.f4986a.r()).intValue();
        this.f5543v = ((Long) F6.f4988e.r()).intValue();
        this.f5544w = ((Long) F6.c.r()).intValue();
        C0937n6 c0937n6 = AbstractC1066q6.f10132M;
        O1.r rVar = O1.r.d;
        this.f5545x = ((Integer) rVar.c.a(c0937n6)).intValue();
        C0937n6 c0937n62 = AbstractC1066q6.N;
        SharedPreferencesOnSharedPreferenceChangeListenerC1023p6 sharedPreferencesOnSharedPreferenceChangeListenerC1023p6 = rVar.c;
        this.y = ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(c0937n62)).intValue();
        this.f5546z = ((Integer) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(AbstractC1066q6.f10140O)).intValue();
        this.f5540s = ((Long) F6.f4989f.r()).intValue();
        this.f5532A = (String) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(AbstractC1066q6.f10150Q);
        this.f5533B = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(AbstractC1066q6.f10154R)).booleanValue();
        this.f5534C = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(AbstractC1066q6.f10159S)).booleanValue();
        this.f5535D = ((Boolean) sharedPreferencesOnSharedPreferenceChangeListenerC1023p6.a(AbstractC1066q6.f10164T)).booleanValue();
        setName("ContentFetchTask");
    }

    public final E4 a() {
        J2 j22 = this.f5539r;
        boolean z4 = this.f5535D;
        synchronized (j22.f5780q) {
            try {
                E4 e4 = null;
                if (((LinkedList) j22.f5781r).isEmpty()) {
                    Y9.m("Queue empty");
                    return null;
                }
                int i4 = 0;
                if (((LinkedList) j22.f5781r).size() < 2) {
                    E4 e42 = (E4) ((LinkedList) j22.f5781r).get(0);
                    if (z4) {
                        ((LinkedList) j22.f5781r).remove(0);
                    } else {
                        e42.a();
                    }
                    return e42;
                }
                int i5 = Integer.MIN_VALUE;
                int i6 = 0;
                for (E4 e43 : (LinkedList) j22.f5781r) {
                    int i7 = e43.f4846n;
                    if (i7 > i5) {
                        i4 = i6;
                    }
                    int i8 = i7 > i5 ? i7 : i5;
                    if (i7 > i5) {
                        e4 = e43;
                    }
                    i6++;
                    i5 = i8;
                }
                ((LinkedList) j22.f5781r).remove(i4);
                return e4;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final C0034i b(View view, E4 e4) {
        if (view != null) {
            boolean globalVisibleRect = view.getGlobalVisibleRect(new Rect());
            if ((view instanceof TextView) && !(view instanceof EditText)) {
                CharSequence text = ((TextView) view).getText();
                if (!TextUtils.isEmpty(text)) {
                    e4.f(text.toString(), globalVisibleRect, view.getX(), view.getY(), view.getWidth(), view.getHeight());
                    return new C0034i(1, 0);
                }
            } else {
                if ((view instanceof WebView) && !(view instanceof InterfaceC0308Md)) {
                    WebView webView = (WebView) view;
                    synchronized (e4.f4839g) {
                        e4.f4845m++;
                    }
                    webView.post(new RunnableC0801k(this, e4, webView, globalVisibleRect));
                    return new C0034i(0, 1);
                }
                if (view instanceof ViewGroup) {
                    ViewGroup viewGroup = (ViewGroup) view;
                    int i4 = 0;
                    int i5 = 0;
                    for (int i6 = 0; i6 < viewGroup.getChildCount(); i6++) {
                        C0034i b4 = b(viewGroup.getChildAt(i6), e4);
                        i4 += b4.f824a;
                        i5 += b4.f825b;
                    }
                    return new C0034i(i4, i5);
                }
            }
        }
        return new C0034i(0, 0);
    }

    public final void c() {
        synchronized (this.f5538q) {
            try {
                if (this.f5536o) {
                    Y9.m("Content hash thread already started, quitting...");
                } else {
                    this.f5536o = true;
                    start();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d() {
        synchronized (this.f5538q) {
            this.f5537p = true;
            Y9.m("ContentFetchThread: paused, pause = true");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0042, code lost:
    
        if (r3.importance != 100) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0048, code lost:
    
        if (r2.inKeyguardRestrictedInputMode() != false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x004a, code lost:
    
        r0 = (android.os.PowerManager) r0.getSystemService("power");
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0052, code lost:
    
        if (r0 == null) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0058, code lost:
    
        if (r0.isScreenOn() == false) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x005a, code lost:
    
        r0 = N1.n.f1204A.f1208f.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0062, code lost:
    
        if (r0 != null) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0064, code lost:
    
        com.google.android.gms.internal.ads.Y9.m("ContentFetchThread: no activity. Sleeping.");
        d();
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0071, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0076, code lost:
    
        if (r0.getWindow() == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0080, code lost:
    
        if (r0.getWindow().getDecorView() == null) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0082, code lost:
    
        r1 = r0.getWindow().getDecorView().findViewById(android.R.id.content);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0092, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0093, code lost:
    
        N1.n.f1204A.f1209g.h("ContentFetchTask.extractContent", r0);
        com.google.android.gms.internal.ads.Y9.m("Failed getting root view of activity. Content not extracted.");
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x006f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x00d8, code lost:
    
        com.google.android.gms.internal.ads.Y9.q("Error in ContentFetchTask", r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x006d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x00c9, code lost:
    
        com.google.android.gms.internal.ads.Y9.q("Error in ContentFetchTask", r0);
        N1.n.f1204A.f1209g.h("ContentFetchTask.run", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00e0 A[EXC_TOP_SPLITTER, LOOP:1: B:9:0x00e0->B:16:0x00e0, LOOP_START, SYNTHETIC] */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.I4.run():void");
    }
}
