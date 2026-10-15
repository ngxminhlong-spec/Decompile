package N1;

import O1.C0081p;
import O1.InterfaceC0096x;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.android.gms.internal.ads.C1335wc;
import com.google.android.gms.internal.ads.J3;
import com.google.android.gms.internal.ads.Y9;
import com.google.android.gms.internal.ads.Zf;
import java.util.Locale;
import t2.C1999f;
import t2.C2000g;
import t2.C2005l;
import t2.K;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* loaded from: classes.dex */
public final class j extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1185a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f1186b;

    public /* synthetic */ j(int i4, Object obj) {
        this.f1185a = i4;
        this.f1186b = obj;
    }

    @Override // android.webkit.WebViewClient
    public void onLoadResource(WebView webView, String str) {
        switch (this.f1185a) {
            case 1:
                C2005l c2005l = (C2005l) this.f1186b;
                int i4 = C2005l.f14914r;
                if (str == null || !str.startsWith("consent://")) {
                    return;
                }
                c2005l.f14916p.x(str);
                return;
            default:
                super.onLoadResource(webView, str);
                return;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onPageFinished(WebView webView, String str) {
        switch (this.f1185a) {
            case 1:
                C2005l c2005l = (C2005l) this.f1186b;
                if (c2005l.f14917q) {
                    return;
                }
                Log.d("UserMessagingPlatform", "Wall html loaded.");
                c2005l.f14917q = true;
                return;
            default:
                super.onPageFinished(webView, str);
                return;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, int i4, String str, String str2) {
        switch (this.f1185a) {
            case 1:
                C2000g c2000g = (C2000g) ((C2005l) this.f1186b).f14916p.f14886u;
                Locale locale = Locale.US;
                K k3 = new K("WebResourceError(" + i4 + ", " + str2 + "): " + str, 2);
                C1999f c1999f = (C1999f) c2000g.f14902i.getAndSet(null);
                if (c1999f == null) {
                    return;
                }
                c1999f.b(k3.a());
                return;
            default:
                super.onReceivedError(webView, i4, str, str2);
                return;
        }
    }

    @Override // android.webkit.WebViewClient
    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        switch (this.f1185a) {
            case 0:
                m mVar = (m) this.f1186b;
                InterfaceC0096x interfaceC0096x = mVar.f1201u;
                if (interfaceC0096x != null) {
                    try {
                        interfaceC0096x.r(Zf.L(1, null, null));
                    } catch (RemoteException e4) {
                        Y9.u("#007 Could not call remote method.", e4);
                    }
                }
                InterfaceC0096x interfaceC0096x2 = mVar.f1201u;
                if (interfaceC0096x2 != null) {
                    try {
                        interfaceC0096x2.A(0);
                        return;
                    } catch (RemoteException e5) {
                        Y9.u("#007 Could not call remote method.", e5);
                        return;
                    }
                }
                return;
            default:
                super.onReceivedError(webView, webResourceRequest, webResourceError);
                return;
        }
    }

    @Override // android.webkit.WebViewClient
    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        switch (this.f1185a) {
            case 1:
                String uri = webResourceRequest.getUrl().toString();
                C2005l c2005l = (C2005l) this.f1186b;
                int i4 = C2005l.f14914r;
                if (uri == null || !uri.startsWith("consent://")) {
                    return false;
                }
                c2005l.f14916p.x(uri);
                return true;
            default:
                return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        }
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        int i4 = this.f1185a;
        int i5 = 0;
        Object obj = this.f1186b;
        switch (i4) {
            case 0:
                m mVar = (m) obj;
                Context context = mVar.f1198r;
                if (str.startsWith(mVar.p())) {
                    return false;
                }
                if (str.startsWith("gmsg://noAdLoaded")) {
                    InterfaceC0096x interfaceC0096x = mVar.f1201u;
                    if (interfaceC0096x != null) {
                        try {
                            interfaceC0096x.r(Zf.L(3, null, null));
                        } catch (RemoteException e4) {
                            Y9.u("#007 Could not call remote method.", e4);
                        }
                    }
                    InterfaceC0096x interfaceC0096x2 = mVar.f1201u;
                    if (interfaceC0096x2 != null) {
                        try {
                            interfaceC0096x2.A(3);
                        } catch (RemoteException e5) {
                            Y9.u("#007 Could not call remote method.", e5);
                        }
                    }
                    mVar.K3(0);
                } else if (str.startsWith("gmsg://scriptLoadFailed")) {
                    InterfaceC0096x interfaceC0096x3 = mVar.f1201u;
                    if (interfaceC0096x3 != null) {
                        try {
                            interfaceC0096x3.r(Zf.L(1, null, null));
                        } catch (RemoteException e6) {
                            Y9.u("#007 Could not call remote method.", e6);
                        }
                    }
                    InterfaceC0096x interfaceC0096x4 = mVar.f1201u;
                    if (interfaceC0096x4 != null) {
                        try {
                            interfaceC0096x4.A(0);
                        } catch (RemoteException e7) {
                            Y9.u("#007 Could not call remote method.", e7);
                        }
                    }
                    mVar.K3(0);
                } else if (str.startsWith("gmsg://adResized")) {
                    InterfaceC0096x interfaceC0096x5 = mVar.f1201u;
                    if (interfaceC0096x5 != null) {
                        try {
                            interfaceC0096x5.g();
                        } catch (RemoteException e8) {
                            Y9.u("#007 Could not call remote method.", e8);
                        }
                    }
                    String queryParameter = Uri.parse(str).getQueryParameter("height");
                    if (!TextUtils.isEmpty(queryParameter)) {
                        try {
                            C1335wc c1335wc = C0081p.f1374f.f1375a;
                            i5 = C1335wc.l(context, Integer.parseInt(queryParameter));
                        } catch (NumberFormatException unused) {
                        }
                    }
                    mVar.K3(i5);
                } else if (!str.startsWith("gmsg://")) {
                    InterfaceC0096x interfaceC0096x6 = mVar.f1201u;
                    if (interfaceC0096x6 != null) {
                        try {
                            interfaceC0096x6.e();
                            mVar.f1201u.f();
                        } catch (RemoteException e9) {
                            Y9.u("#007 Could not call remote method.", e9);
                        }
                    }
                    if (mVar.f1202v != null) {
                        Uri parse = Uri.parse(str);
                        try {
                            parse = mVar.f1202v.a(parse, context, null, null);
                        } catch (J3 e10) {
                            Y9.t("Unable to process ad data", e10);
                        }
                        str = parse.toString();
                    }
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setData(Uri.parse(str));
                    context.startActivity(intent);
                }
                return true;
            default:
                C2005l c2005l = (C2005l) obj;
                int i6 = C2005l.f14914r;
                if (str == null || !str.startsWith("consent://")) {
                    return false;
                }
                c2005l.f14916p.x(str);
                return true;
        }
    }
}
