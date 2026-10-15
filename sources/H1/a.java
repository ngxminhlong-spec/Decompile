package H1;

import C0.C;
import O1.C0101z0;
import Q1.I;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.GridLayoutManager;
import com.duracodefactory.logiccircuitsimulatorpro.ui.RecentsRecyclerView;
import com.duracodefactory.logiccircuitsimulatorpro.ui.TimeDiagramLayout;
import com.google.android.gms.internal.ads.InterfaceC0308Md;
import com.google.android.gms.internal.ads.Ur;
import h2.y;
import o1.InterfaceC1833I;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public class a implements b1.e, InterfaceC1833I {

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ int f854o;

    /* renamed from: p, reason: collision with root package name */
    public int f855p;

    /* renamed from: q, reason: collision with root package name */
    public Object f856q;

    /* renamed from: r, reason: collision with root package name */
    public Object f857r;

    /* renamed from: s, reason: collision with root package name */
    public Object f858s;

    public a() {
        this.f854o = 2;
        this.f856q = null;
        this.f857r = null;
        this.f855p = 0;
        this.f858s = new Object();
    }

    public /* synthetic */ a(int i4) {
        this.f854o = i4;
    }

    public a(int i4, String str, String str2, a aVar) {
        this.f854o = 0;
        this.f855p = i4;
        this.f856q = str;
        this.f857r = str2;
        this.f858s = aVar;
    }

    public a(TimeDiagramLayout timeDiagramLayout, RecentsRecyclerView recentsRecyclerView, int i4, GridLayoutManager gridLayoutManager) {
        this.f854o = 7;
        this.f858s = timeDiagramLayout;
        this.f856q = recentsRecyclerView;
        this.f855p = i4;
        this.f857r = gridLayoutManager;
    }

    public a(InterfaceC0308Md interfaceC0308Md) {
        this.f854o = 1;
        this.f856q = interfaceC0308Md.getLayoutParams();
        ViewParent parent = interfaceC0308Md.getParent();
        this.f858s = interfaceC0308Md.g0();
        if (parent == null || !(parent instanceof ViewGroup)) {
            throw new Exception("Could not get the parent of the WebView for an overlay.");
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        this.f857r = viewGroup;
        this.f855p = viewGroup.indexOfChild(interfaceC0308Md.L());
        viewGroup.removeView(interfaceC0308Md.L());
        interfaceC0308Md.y0(true);
    }

    public C0101z0 a() {
        C0101z0 c0101z0;
        a aVar = (a) this.f858s;
        if (aVar == null) {
            c0101z0 = null;
        } else {
            c0101z0 = new C0101z0(aVar.f855p, (String) aVar.f856q, (String) aVar.f857r, null, null);
        }
        return new C0101z0(this.f855p, (String) this.f856q, (String) this.f857r, c0101z0, null);
    }

    public Looper b() {
        Looper looper;
        synchronized (this.f858s) {
            try {
                if (this.f855p != 0) {
                    y.j((HandlerThread) this.f856q, "Invalid state: handlerThread should already been initialized.");
                } else if (((HandlerThread) this.f856q) == null) {
                    I.w("Starting the looper thread.");
                    HandlerThread handlerThread = new HandlerThread("LooperProvider");
                    this.f856q = handlerThread;
                    handlerThread.start();
                    this.f857r = new Ur(((HandlerThread) this.f856q).getLooper(), 0);
                    I.w("Looper thread started.");
                } else {
                    I.w("Resuming the looper thread");
                    this.f858s.notifyAll();
                }
                this.f855p++;
                looper = ((HandlerThread) this.f856q).getLooper();
            } catch (Throwable th) {
                throw th;
            }
        }
        return looper;
    }

    public JSONObject c() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Code", this.f855p);
        jSONObject.put("Message", (String) this.f856q);
        jSONObject.put("Domain", (String) this.f857r);
        a aVar = (a) this.f858s;
        if (aVar == null) {
            jSONObject.put("Cause", "null");
            return jSONObject;
        }
        jSONObject.put("Cause", aVar.c());
        return jSONObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002e, code lost:
    
        if (r8 != r9) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0031, code lost:
    
        r7 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0060, code lost:
    
        if (r7 == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0062, code lost:
    
        r7 = r17.f857r;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
    
        r7 = (android.graphics.drawable.Drawable) r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
    
        r8 = r3.x;
        r10 = r3.y;
        r7.setBounds((int) (r8 - r4), (int) (r10 - r4), (int) (r8 + r4), (int) (r10 + r4));
        r7.draw(r18);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        r7 = r17.f858s;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0048, code lost:
    
        if (r8 != r9) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005e, code lost:
    
        if (r8 != r9) goto L32;
     */
    @Override // b1.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void j(android.graphics.Canvas r18) {
        /*
            Method dump skipped, instructions count: 548
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: H1.a.j(android.graphics.Canvas):void");
    }

    @Override // o1.InterfaceC1833I
    public void s(int i4) {
        ((RecentsRecyclerView) this.f856q).post(new C(i4, 13, this));
    }

    public String toString() {
        switch (this.f854o) {
            case 0:
                try {
                    return c().toString(2);
                } catch (JSONException unused) {
                    return "Error forming toString output.";
                }
            default:
                return super.toString();
        }
    }
}
