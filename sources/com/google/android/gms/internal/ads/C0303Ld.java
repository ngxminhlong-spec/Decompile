package com.google.android.gms.internal.ads;

import Q1.DialogInterfaceOnClickListenerC0105d;
import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.WindowManager;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebStorage;
import android.webkit.WebView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-6ef7449bfc4a9963e18f062677f14f1522bd0a2d779b053409b8e2de3977822d */
/* renamed from: com.google.android.gms.internal.ads.Ld, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0303Ld extends WebChromeClient {

    /* renamed from: a, reason: collision with root package name */
    public final C0348Ud f6145a;

    public C0303Ld(C0348Ud c0348Ud) {
        this.f6145a = c0348Ud;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Context b(WebView webView) {
        if (!(webView instanceof InterfaceC0308Md)) {
            return webView.getContext();
        }
        InterfaceC0308Md interfaceC0308Md = (InterfaceC0308Md) webView;
        Activity g4 = interfaceC0308Md.g();
        return g4 != null ? g4 : interfaceC0308Md.getContext();
    }

    public final boolean a(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z4) {
        N1.a aVar;
        C0348Ud c0348Ud = this.f6145a;
        if (c0348Ud != null) {
            try {
                C0396ae c0396ae = c0348Ud.f7165o.f7464A;
                if (c0396ae != null && (aVar = c0396ae.f8132J) != null && aVar != null && !aVar.b()) {
                    aVar.a("window." + str + "('" + str3 + "')");
                    return false;
                }
            } catch (WindowManager.BadTokenException e4) {
                Y9.t("Fail to display Dialog.", e4);
                return true;
            }
        }
        Q1.N n4 = N1.n.f1204A.c;
        AlertDialog.Builder h4 = Q1.N.h(context);
        h4.setTitle(str2);
        if (!z4) {
            h4.setMessage(str3).setPositiveButton(R.string.ok, new DialogInterfaceOnClickListenerC0293Jd(jsResult, 1)).setNegativeButton(R.string.cancel, new DialogInterfaceOnClickListenerC0293Jd(jsResult, 0)).setOnCancelListener(new DialogInterfaceOnCancelListenerC0288Id(0, jsResult)).create().show();
            return true;
        }
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setText(str3);
        EditText editText = new EditText(context);
        editText.setText(str4);
        linearLayout.addView(textView);
        linearLayout.addView(editText);
        h4.setView(linearLayout).setPositiveButton(R.string.ok, new DialogInterfaceOnClickListenerC0105d(1, jsPromptResult, editText)).setNegativeButton(R.string.cancel, new DialogInterfaceOnClickListenerC0691ha(1, jsPromptResult)).setOnCancelListener(new DialogInterfaceOnCancelListenerC0288Id(1, jsPromptResult)).create().show();
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.webkit.WebChromeClient
    public final void onCloseWindow(WebView webView) {
        if (!(webView instanceof InterfaceC0308Md)) {
            Y9.s("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        P1.a v02 = ((InterfaceC0308Md) webView).v0();
        if (v02 == null) {
            Y9.s("Tried to close an AdWebView not associated with an overlay.");
        } else {
            v02.c();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String message = consoleMessage.message();
        String sourceId = consoleMessage.sourceId();
        String l4 = U.a.l(U.a.n("JS: ", message, " (", sourceId, ":"), consoleMessage.lineNumber(), ")");
        if (l4.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        int i4 = AbstractC0298Kd.f6033a[consoleMessage.messageLevel().ordinal()];
        if (i4 == 1) {
            Y9.p(l4);
        } else if (i4 == 2) {
            Y9.s(l4);
        } else if (i4 == 3 || i4 == 4) {
            Y9.r(l4);
        } else if (i4 != 5) {
            Y9.r(l4);
        } else {
            Y9.m(l4);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z4, boolean z5, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        C0396ae c0396ae = this.f6145a.f7165o.f7464A;
        if (c0396ae != null) {
            webView2.setWebViewClient(c0396ae);
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    @Override // android.webkit.WebChromeClient
    public final void onExceededDatabaseQuota(String str, String str2, long j4, long j5, long j6, WebStorage.QuotaUpdater quotaUpdater) {
        long j7 = 5242880 - j6;
        if (j7 <= 0) {
            quotaUpdater.updateQuota(j4);
            return;
        }
        if (j4 == 0) {
            if (j5 > j7 || j5 > 1048576) {
                j5 = 0;
            }
        } else if (j5 == 0) {
            j5 = Math.min(Math.min(131072L, j7) + j4, 1048576L);
        } else {
            if (j5 <= Math.min(1048576 - j4, j7)) {
                j4 += j5;
            }
            j5 = j4;
        }
        quotaUpdater.updateQuota(j5);
    }

    @Override // android.webkit.WebChromeClient
    public final void onGeolocationPermissionsShowPrompt(String str, GeolocationPermissions.Callback callback) {
        if (callback != null) {
            Q1.N n4 = N1.n.f1204A.c;
            C0348Ud c0348Ud = this.f6145a;
            callback.invoke(str, Q1.N.I(c0348Ud.getContext(), "android.permission.ACCESS_FINE_LOCATION") || Q1.N.I(c0348Ud.getContext(), "android.permission.ACCESS_COARSE_LOCATION"), true);
        }
    }

    @Override // android.webkit.WebChromeClient
    public final void onHideCustomView() {
        P1.a v02 = this.f6145a.f7165o.v0();
        if (v02 == null) {
            Y9.s("Could not get ad overlay when hiding custom view.");
        } else {
            v02.h();
        }
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return a(b(webView), "alert", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return a(b(webView), "onBeforeUnload", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return a(b(webView), "confirm", str, str2, null, jsResult, null, false);
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return a(b(webView), "prompt", str, str2, str3, null, jsPromptResult, true);
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, int i4, WebChromeClient.CustomViewCallback customViewCallback) {
        P1.a v02 = this.f6145a.f7165o.v0();
        if (v02 == null) {
            Y9.s("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
            return;
        }
        Activity activity = v02.f1492p;
        FrameLayout frameLayout = new FrameLayout(activity);
        v02.f1498v = frameLayout;
        frameLayout.setBackgroundColor(-16777216);
        v02.f1498v.addView(view, -1, -1);
        activity.setContentView(v02.f1498v);
        v02.f1485E = true;
        v02.f1499w = customViewCallback;
        v02.f1497u = true;
        v02.K3(i4);
    }

    @Override // android.webkit.WebChromeClient
    public final void onShowCustomView(View view, WebChromeClient.CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }
}
