package androidx.activity.result;

import C0.O;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.ColorStateList;
import android.graphics.Shader;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.duracodefactory.logiccircuitsimulatorpro.MainActivity;
import java.util.List;
import o2.AbstractC1895f;
import z3.C2135b;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public int f2431a;

    /* renamed from: b, reason: collision with root package name */
    public Object f2432b;
    public Object c;

    public c(Shader shader, ColorStateList colorStateList, int i4) {
        this.f2432b = shader;
        this.c = colorStateList;
        this.f2431a = i4;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x01e2, code lost:
    
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x01da, code lost:
    
        if (r13.size() <= 0) goto L94;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x01dc, code lost:
    
        r0 = new com.google.android.gms.internal.ads.Qw(r13, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x01e3, code lost:
    
        if (r0 == null) goto L97;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x01f5, code lost:
    
        if (r11 == 1) goto L112;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x01f8, code lost:
    
        if (r11 == 2) goto L111;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x01fa, code lost:
    
        r16 = (int[]) r0.f6710p;
        r17 = (float[]) r0.f6711q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0208, code lost:
    
        if (r10 == 1) goto L109;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x020a, code lost:
    
        if (r10 == 2) goto L108;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x020c, code lost:
    
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x021f, code lost:
    
        r11 = new android.graphics.LinearGradient(r21, r22, r26, r27, r16, r17, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0268, code lost:
    
        return new androidx.activity.result.c(r11, null, 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0219, code lost:
    
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x021c, code lost:
    
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0223, code lost:
    
        r11 = new android.graphics.SweepGradient(r8, r9, (int[]) r0.f6710p, (float[]) r0.f6711q);
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0235, code lost:
    
        if (r25 <= 0.0f) goto L125;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0237, code lost:
    
        r20 = (int[]) r0.f6710p;
        r21 = (float[]) r0.f6711q;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0246, code lost:
    
        if (r10 == 1) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0249, code lost:
    
        if (r10 == 2) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x024b, code lost:
    
        r0 = android.graphics.Shader.TileMode.CLAMP;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x025c, code lost:
    
        r11 = new android.graphics.RadialGradient(r8, r9, r25, r20, r21, r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0256, code lost:
    
        r0 = android.graphics.Shader.TileMode.MIRROR;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0259, code lost:
    
        r0 = android.graphics.Shader.TileMode.REPEAT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0270, code lost:
    
        throw new org.xmlpull.v1.XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x01e7, code lost:
    
        if (r20 == false) goto L99;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01e9, code lost:
    
        r0 = new com.google.android.gms.internal.ads.Qw(r6, r5, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01ef, code lost:
    
        r0 = new com.google.android.gms.internal.ads.Qw(r6, r12);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.activity.result.c b(android.content.res.Resources r30, int r31, android.content.res.Resources.Theme r32) {
        /*
            Method dump skipped, instructions count: 665
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.activity.result.c.b(android.content.res.Resources, int, android.content.res.Resources$Theme):androidx.activity.result.c");
    }

    public C2135b a() {
        if (!"".isEmpty()) {
            throw new IllegalStateException("Missing required properties:".concat(""));
        }
        String str = (String) this.f2432b;
        return new C2135b(this.f2431a, ((Long) this.c).longValue(), str);
    }

    public boolean c() {
        ColorStateList colorStateList;
        return ((Shader) this.f2432b) == null && (colorStateList = (ColorStateList) this.c) != null && colorStateList.isStateful();
    }

    public void d(g gVar) {
        Bundle bundle;
        f fVar = (f) this.c;
        fVar.f2438e.add((String) this.f2432b);
        int i4 = this.f2431a;
        androidx.activity.b bVar = (androidx.activity.b) fVar;
        androidx.activity.d dVar = bVar.f2411i;
        Intent putExtra = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", gVar);
        if (putExtra.getExtras() != null && putExtra.getExtras().getClassLoader() == null) {
            putExtra.setExtrasClassLoader(dVar.getClassLoader());
        }
        if (putExtra.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundle = putExtra.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            putExtra.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        } else {
            bundle = null;
        }
        Bundle bundle2 = bundle;
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(putExtra.getAction())) {
            String[] stringArrayExtra = putExtra.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            AbstractC1895f.v(dVar, stringArrayExtra, i4);
            return;
        }
        if (!"androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(putExtra.getAction())) {
            dVar.startActivityForResult(putExtra, i4, bundle2);
            return;
        }
        g gVar2 = (g) putExtra.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
        try {
            dVar.startIntentSenderForResult(gVar2.f2442o, i4, gVar2.f2443p, gVar2.f2444q, gVar2.f2445r, 0, bundle2);
        } catch (IntentSender.SendIntentException e4) {
            new Handler(Looper.getMainLooper()).post(new O(i4, 2, bVar, e4));
        }
    }

    public void e(B0.d dVar, List list) {
        ((Handler) this.f2432b).post(new C1.f(this.f2431a, dVar, (MainActivity) this.c, list));
    }
}
